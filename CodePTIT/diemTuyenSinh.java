import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ThiSinh{
    public String ma, ten, tt, dt;
    public double diem;
    public int kv;
    public ThiSinh(int ma, String ten, double diem, String dt, int kv){
        this.ma = Integer.toString(ma);
        while (this.ma.length() < 2){
            this.ma = "0" + this.ma;
        }
        this.ma = "TS" + this.ma;

        String[] a = ten.trim().split("\\s+");
        String res = "";
        for (String x : a){
            res += x.substring(0,1).toUpperCase() + x.substring(1, x.length()).toLowerCase() + " ";
        }
        this.ten = res.substring(0, res.length() - 1);

        this.diem = diem;
        this.dt = dt;
        this.kv = kv;

        if (kv == 1) this.diem += 1.5;
        else if (kv == 2) this.diem += 1;
        if (!dt.equals("Kinh")) this.diem += 1.5;

        if (this.diem >= 20.5) tt = "Do";
        else tt = "Truot";
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + String.format("%.1f", this.diem) + " " + this.tt;
    }
}

public class diemTuyenSinh {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<ThiSinh> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            double diem = sc.nextDouble();
            sc.nextLine();
            String dt = sc.nextLine();
            int kv = sc.nextInt();
            arr.add(new ThiSinh(i, ten, diem, dt, kv));
        }
        Collections.sort(arr, new Comparator<ThiSinh>() {
            public int compare(ThiSinh a, ThiSinh b){
                if (a.diem == b.diem) return a.ma.compareTo(b.ma);
                return Double.compare(b.diem, a.diem);
            }
        });
        for (ThiSinh x : arr) System.out.println(x);
    }
}
