
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class CLB{
    public String maCLB, ten;
    public int giaVe;
    public CLB(String maCLB, String ten, int giaVe){
        this.maCLB = maCLB;
        this.ten = ten; 
        this.giaVe = giaVe;
    }
    public String toString(){
        return this.ten;
    }
}

class TranDau{
    public CLB x;
    public String maTran;
    public int cdv, doanhThu;
    public TranDau(CLB x, String maTran, int cdv){
        this.x = x;
        this.maTran = maTran;
        this.cdv = cdv;
        this.doanhThu = this.cdv * this.x.giaVe;
    }
    public String toString(){
        return this.maTran + " " + this.x + " " + this.doanhThu;
    }
}

public class CauLacBoBongDa2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<CLB> arr = new ArrayList<>();
        for (int i = 0; i < t; i++){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int giaVe = sc.nextInt();
            arr.add(new CLB(ma, ten, giaVe));
        }
        
        int k = sc.nextInt();
        sc.nextLine();
        ArrayList<TranDau> arr2 = new ArrayList<>();
        for (int i = 0; i < k; i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < t; j++){
                if (arr.get(j).maCLB.equals(s[0].substring(1,3))){
                    arr2.add(new TranDau(arr.get(j), s[0], Integer.valueOf(s[1])));
                }
            }
        }
        
        Collections.sort(arr2, new Comparator<TranDau>(){
            public int compare(TranDau a, TranDau b){
                if (a.doanhThu == b.doanhThu){
                    return a.x.ten.compareTo(b.x.ten);
                }
                return b.doanhThu - a.doanhThu;
            }
        });
        
        for (TranDau x : arr2) System.out.println(x);
    }
}
//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000