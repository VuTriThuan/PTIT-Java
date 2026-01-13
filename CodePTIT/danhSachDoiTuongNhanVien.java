import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class NhanVien{
    public String ma, ten, gt, ns, dc, thue, hd;
    public int ngay, thang, nam;
    public NhanVien(int ma, String ten, String gt, String ns, String dc, String thue, String hd){
        this.ma = String.valueOf(ma);
        while (this.ma.length() < 5) this.ma = "0" + this.ma;
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.thue = thue;
        this.hd = hd;

        ngay = Integer.valueOf(this.ns.substring(0, 2));
        thang = Integer.valueOf(this.ns.substring(3, 5));
        nam = Integer.valueOf(this.ns.substring(6, 10));
        
    }
    public String toString(){
        return this.ma+" "+this.ten+" "+this.gt+" "+this.ns+" "+this.dc+" "+this.thue+" "+this.hd;
    }
}

public class danhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++){
            String ten = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            String dc = sc.nextLine();
            String thue = sc.nextLine();
            String hd = sc.nextLine();
            arr.add(new NhanVien(i, ten, gt, ns, dc, thue, hd));
        }
        Collections.sort(arr, new Comparator<NhanVien>() {
            public int compare(NhanVien a, NhanVien b){
                if (a.nam == b.nam){
                    if (a.thang == b.thang) return a.ngay - b.ngay;
                    return a.thang - b.thang;
                }
                return a.nam - b.nam;
            }
        });
        for (NhanVien x : arr) System.out.println(x);
    }
}

