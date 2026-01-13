import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class CLB{
    public String ma, ten;
    public long giaVe;
    public CLB(String ma, String ten, long giaVe){
        this.ma = ma;
        this.ten = ten;
        this.giaVe = giaVe;
    }
    public String toString(){
        return this.ten;
    }
}

class TranDau{
    public CLB x;
    public String ma;
    public long cdv, dt;
    public TranDau(CLB x, String ma, long cdv){
        this.x = x;
        this.ma = ma;
        this.cdv = cdv;
        dt = x.giaVe * cdv;
    }
    public String toString(){
        return this.ma + " " + this.x + " " + this.dt;
    }
}

public class cauLacBoBongDa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CLB> a = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            a.add(new CLB(sc.nextLine(), sc.nextLine(), sc.nextLong()));
        }
        ArrayList<TranDau> b = new ArrayList<>();
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            String maT = s[0];
            long cdv = Long.valueOf(s[1]);
            for (int j = 0; j < n; j++){
                if (maT.substring(1,3).equals(a.get(j).ma)){
                    b.add(new TranDau(a.get(j), maT, cdv));
                    break;
                }
            }
        }
        Collections.sort(b, new Comparator<TranDau>() {
            public int compare(TranDau a, TranDau b){
                if (a.dt == b.dt) return a.x.ten.compareTo(b.x.ten);
                return Long.compare(b.dt, a.dt);
            }
        });
        for (TranDau x : b) System.out.println(x);
    }
}
// 2
// AC
// AC Milan
// 12
// MU
// Manchester United
// 10
// 2
// IAC1 80000
// EMU2 60000
