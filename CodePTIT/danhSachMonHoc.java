import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MonHoc{
    public String ma, ten;
    public int tin;
    public MonHoc(String ma, String ten, int tin){
        this.ma = ma;
        this.ten = ten;
        this.tin = tin;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.tin;
    }
}

public class danhSachMonHoc {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<MonHoc> arr = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int tin = sc.nextInt();
            arr.add(new MonHoc(ma, ten, tin));
        }
        Collections.sort(arr, new Comparator<MonHoc>() {
            public int compare(MonHoc a, MonHoc b){
                return a.ten.compareTo(b.ten);
            }
        });
        for (MonHoc x : arr) System.out.println(x);
    }
}
