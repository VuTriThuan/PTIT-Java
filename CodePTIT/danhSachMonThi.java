import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MonHoc{
    public String ma, ten, ht;
    public MonHoc(String ma, String ten, String ht){
        this.ma = ma;
        this.ten = ten;
        this.ht = ht;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.ht;
    }
}

public class danhSachMonThi {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0){
            arr.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<MonHoc>() {
            public int compare(MonHoc a, MonHoc b){
                return a.ma.compareTo(b.ma);
            }
        });
        for (MonHoc x : arr) System.out.println(x);
    }
}
