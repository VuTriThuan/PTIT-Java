import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class BangDiem{
    public String ma, ten;
    public double d;
    public int d1, d2, d3, xh;
    public BangDiem(int ma, String ten, int d1, int d2, int d3){
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
        d = (double)(Math.round(((double)(this.d1 * 3 + this.d2 * 3+ this.d3 * 2) / 8) * 100.0)) / 100;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + String.format("%.2f", this.d) + " " + this.xh;
    }
}

public class tinhDiemTrungBinh {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<BangDiem> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            int d1 = sc.nextInt(), d2 = sc.nextInt(), d3 = sc.nextInt();
            arr.add(new BangDiem(i, ten, d1, d2, d3));
        }
        Collections.sort(arr, new Comparator<BangDiem>() {
            public int compare(BangDiem a, BangDiem b){
                if (a.d == b.d) return a.ma.compareTo(b.ma);
                return Double.compare(b.d, a.d);
            }
        });
        arr.get(0).xh = 1;
        System.out.println(arr.get(0));
        for (int i = 1; i < n; i++){
            if (arr.get(i).d == arr.get(i -1).d) arr.get(i).xh = arr.get(i - 1).xh;
            else arr.get(i).xh = i + 1;
            System.out.println(arr.get(i));
        }
    }
}
