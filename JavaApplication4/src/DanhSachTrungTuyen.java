import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ThiSinh{
    public String ma, ten, trangThai;
    public double d1, d2, d3, d, uuTien;
    public ThiSinh(String ma, String ten, double d1, double d2, double d3){
        this.ma = ma;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        
        this.ten = "";
        String[] a = ten.trim().toLowerCase().split("\\s+");
        for (String x : a){
            this.ten += x.substring(0,1).toUpperCase() + x.substring(1) + " ";
        }
        
        if (this.ma.charAt(2) == '1') this.uuTien = (double)0.5;
        else if (this.ma.charAt(2) == '2') this.uuTien = (double)1.0;
        else if (this.ma.charAt(2) == '3') this.uuTien = (double)2.5;
        
        this.d = d1 * 2 + d2 + d3 + this.uuTien;
        this.trangThai = "";
    }
    public String toString(){
        String res = this.ma + " " + this.ten;
        
        if (this.uuTien * 10 == (int)this.uuTien * 10) res += String.format("%.0f", this.uuTien);
        else res += String.format("%.1f", this.uuTien);
   
        res += " ";
        
        if ((this.d * 10) == (int)this.d * 10) res += String.format("%.0f", this.d);
        else res += String.format("%.1f", this.d);
        
        return res + " " + this.trangThai;
    }
}

public class DanhSachTrungTuyen {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = sc.nextInt();
        ArrayList<ThiSinh> arr = new ArrayList<>();
        while(t-- > 0){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            double d1 = sc.nextDouble();
            double d2 = sc.nextDouble();
            double d3 = sc.nextDouble();
            arr.add(new ThiSinh(ma, ten, d1, d2, d3));
        }
        int k = sc.nextInt();
        Collections.sort(arr, new Comparator<ThiSinh>(){
            public int compare(ThiSinh a, ThiSinh b){
                if (a.d == b.d) return a.ma.compareTo(b.ma);
                return Double.compare(b.d, a.d);
            }
        });
        double diemChuan = arr.get(k - 1).d;
        System.out.printf("%.1f\n", diemChuan);
        for (ThiSinh x : arr){
            if (x.d >= diemChuan){
                x.trangThai = "TRUNG TUYEN";
            }
            else{
                x.trangThai = "TRUOT";
            }
            System.out.println(x);
        }
    }
}
