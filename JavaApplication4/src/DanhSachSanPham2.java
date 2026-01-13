
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham{
    public String ma, ten;
    public int ban, han;
    public SanPham(String ma, String ten, int ban, int han){
        this.ma = ma;
        this.ten = ten;
        this.ban = ban;
        this.han = han;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.ban + " " + this.han;
    }
}


public class DanhSachSanPham2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = sc.nextInt();
        ArrayList<SanPham> arr = new ArrayList<>();
        while (t-- > 0){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int ban = sc.nextInt();
            int han = sc.nextInt();
            arr.add(new SanPham(ma, ten, ban, han));
        }
        Collections.sort(arr, new Comparator<SanPham>(){
            public int compare(SanPham a, SanPham b){
                if (a.ban == b.ban){
                    return a.ma.compareTo(b.ma);
                }
                return b.ban - a.ban;
            }
        });
        for (SanPham x : arr){
            System.out.println(x);
        }
    }
}
