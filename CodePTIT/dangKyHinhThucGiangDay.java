import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MonHoc{
    public String ma, ten, tin, lt, th;
    public MonHoc(String ma, String ten, String tin, String lt, String th){
        this.ma = ma;
        this.ten = ten;
        this.tin = tin;
        this.lt = lt; 
        this.th = th;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.tin + " " + this.lt + " " + this.th;
    }
}

public class dangKyHinhThucGiangDay {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0){
            String ma = sc.nextLine(), ten = sc.nextLine(), tin = sc.nextLine(), lt = sc.nextLine(), th = sc.nextLine();
            MonHoc m = new MonHoc(ma, ten, tin, lt, th);
            if (!m.th.equals("Truc tiep")) arr.add(m);
        }
        Collections.sort(arr, new Comparator<MonHoc>() {
            public int compare(MonHoc a, MonHoc b){
                return a.ma.compareTo(b.ma);
            }
        });
        for (MonHoc x : arr) System.out.println(x);
    }
}
