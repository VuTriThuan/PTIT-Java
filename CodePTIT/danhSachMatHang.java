import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang{
    public String ma, ten, dv;
    public int mua, ban, lai;
    public MatHang(String ma, String ten, String dv, int mua, int ban){
        this.ma = ma;
        this.ten = ten;
        this.dv = dv;
        this.mua = mua;
        this.ban = ban;
        this.lai = this.ban - this.mua;
    }
    public String toString(){
        return "MH" + this.ma + " " + this.ten + " " + this.dv + 
        " " + this.mua + " " + this.ban + " " + this.lai;
    }
}

public class danhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            String ma = Integer.toString(i);
            while (ma.length() < 3){
                ma = "0" + ma;
            }
            String ten = sc.nextLine();
            String dv = sc.nextLine();
            int mua = sc.nextInt();
            int ban = sc.nextInt();
            MatHang m = new MatHang(ma, ten, dv, mua, ban);
            arr.add(m);
        }
        Collections.sort(arr, new Comparator<MatHang>() {
            public int compare(MatHang m1, MatHang m2){
                if (m2.lai == m1.lai){
                    return Integer.valueOf(m1.ma) - Integer.valueOf(m2.ma);
                }
                else return m2.lai - m1.lai;
            }
        });
        for (MatHang x : arr) System.out.println(x);
    }
}

// 2
// Ao phong tre em
// Cai
// 25000
// 41000
// Ao khoac nam
// Cai
// 240000
// 515000
