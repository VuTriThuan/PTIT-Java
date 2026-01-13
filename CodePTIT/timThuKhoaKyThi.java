import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ThiSinh{
    public String ten, ns, ma;
    public double d;
    public ThiSinh(int ma, String ten, String ns, double d){
        this.ma = String.valueOf(ma);
        this.ten = ten;
        this.ns = ns;
        this.d = d;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.ns + " " + String.format("%.1f", this.d);
    }
}

public class timThuKhoaKyThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double maxx = 0;
        ArrayList<ThiSinh> arr = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            double d1 = sc.nextDouble(), d2 = sc.nextDouble(), d3 = sc.nextDouble();
            maxx = Math.max(maxx, d1 + d2 + d3);
            arr.add(new ThiSinh(i, ten, ns, d1 + d2 + d3));
        }
        Collections.sort(arr, new Comparator<ThiSinh>() {
            public int compare(ThiSinh a, ThiSinh b){
                if (a.d == b.d) return a.ma.compareTo(b.ma);
                return Double.compare(b.d, a.d);
            };
        });
        for (ThiSinh x : arr){
            if (x.d != maxx) break;
            System.out.println(x);
        }
    }
}


