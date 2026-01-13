import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang{
    public String ma, ten, loai;
    public double mua, ban;
    public MatHang(String ma, String ten, String loai, double mua, double ban){
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.mua = mua;
        this.ban = ban;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.loai + " " + String.format("%.2f", (this.ban - this.mua));
    }
}

public class sapXepMatHang {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = sc.nextInt();
        ArrayList<MatHang> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            String ma = Integer.toString(i);
            while (ma.length() < 2){
                ma = "0" + ma;
            }
            ma = "MH" + ma;
            String ten = sc.nextLine();
            String loai = sc.nextLine();
            double mua = sc.nextDouble();
            double ban = sc.nextDouble();
            arr.add(new MatHang(ma, ten, loai, mua, ban));
        }
        Collections.sort(arr, new Comparator<MatHang>() {
            public int compare(MatHang a, MatHang b){
                return (int)(b.ban - b.mua) - (int)(a.ban - a.mua);
            }
        });
        for (MatHang x : arr) System.out.println(x);
    }
}
