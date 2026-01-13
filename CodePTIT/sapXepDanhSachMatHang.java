import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang{
    public String ma, ten, nhom;
    public double ln;
    public MatHang(int ma, String ten, String nhom, double ln){
        this.ma = String.valueOf(ma);
        this.ten = ten;
        this.nhom = nhom;
        this.ln = ln;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.nhom + " " + String.format("%.2f", this.ln);
    }
}

public class sapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> arr = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            double mua = sc.nextDouble();
            double ban = sc.nextDouble();
            arr.add(new MatHang(i, ten, nhom, ban - mua));
        }
        Collections.sort(arr, new Comparator<MatHang>() {
            public int compare(MatHang a, MatHang b){
                return Double.compare(b.ln, a.ln);
            }
        });
        for(MatHang x : arr) System.out.println(x);
    }
}
