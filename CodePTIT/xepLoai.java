import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class BangDiem{
    public String ma, ten, xl;
    public double d1, d2, d3, d;
    public BangDiem(int ma, String ten, double d1, double d2, double d3){
        this.ma = Integer.toString(ma);
        while (this.ma.length() < 2){
            this.ma = "0" + this.ma;
        }
        this.ma = "SV" + this.ma;

        String[] a = ten.trim().split("\\s+");
        String res = "";
        for (String x : a){
            res += x.substring(0,1).toUpperCase() + x.substring(1, x.length()).toLowerCase() + " ";
        }
        this.ten = res.substring(0, res.length() - 1);

        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        d = d1 * 0.25 + d2 * 0.35 + d3 * 0.4;
        d = (double)(Math.round(d * 100.0)) / 100;

        if (d < 5) xl = "KEM";
        else if (d < 6.5) xl = "TRUNG BINH";
        else if (d < 8) xl = "KHA";
        else xl = "GIOI";
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + String.format("%.2f", this.d) + " " + this.xl;
    }
}

public class xepLoai {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<BangDiem> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            double d1 = sc.nextDouble(), d2 = sc.nextDouble(), d3 = sc.nextDouble();
            arr.add(new BangDiem(i, ten, d1, d2, d3));
        }
        Collections.sort(arr, new Comparator<BangDiem>() {
            public int compare(BangDiem a, BangDiem b){
                return Double.compare(b.d, a.d);
            }
        });
        for (BangDiem x : arr) System.out.println(x);
    }
}
