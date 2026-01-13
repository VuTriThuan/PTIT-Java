
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DoanhNghiep{
    public String ma, ten;
    public int so;
    public DoanhNghiep(String ma, String ten, int so){
        this.ma = ma;
        this.ten = ten;
        this.so = so;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.so;
    }
}


public class DanhSachDoanhNghiep {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DN.in"));
        int t = sc.nextInt();
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        while (t-- > 0){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int so = sc.nextInt();
            arr.add(new DoanhNghiep(ma, ten, so));
        }
        Collections.sort(arr, new Comparator<DoanhNghiep>(){
            public int compare(DoanhNghiep a, DoanhNghiep b){
                return a.ma.compareTo(b.ma);
            }
        });
        for (DoanhNghiep x : arr){
            System.out.println(x);
        }
    }
}
