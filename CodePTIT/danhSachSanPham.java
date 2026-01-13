import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham{
    public String ma, ten;
    public int gia, bh;
    public SanPham(String ma, String ten, int gia, int bh){
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.bh = bh;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.gia + " " + this.bh;
    }
}

public class danhSachSanPham {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SV.in"));
        ArrayList<SanPham> arr = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int gia = sc.nextInt();
            int bh = sc.nextInt();
            arr.add(new SanPham(ma, ten, gia, bh));
        }
        Collections.sort(arr, new Comparator<SanPham>() {
            public int compare(SanPham a, SanPham b){
                if (a.gia == b.gia) return a.ma.compareTo(b.ma);
                return b.gia - a.gia;
            }
        });
        for (SanPham x : arr) System.out.println(x);
    }
}
