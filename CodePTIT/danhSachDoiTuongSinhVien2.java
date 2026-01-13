import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien{
    public String ten, lop, msv, ns;
    public double gpa;
    public SinhVien(int msv, String ten, String lop, String ns, double gpa){
        this.msv = String.valueOf(msv);
        while (this.msv.length() < 3) this.msv = "0" + this.msv;
        this.msv = "B20DCCN" + this.msv;

        String[] a = ten.trim().split("\\s+");
        String res = "";
        for (String s : a){
            res += s.substring(0, 1).toUpperCase() + s.substring(1, s.length()).toLowerCase() + " ";
        }
        this.ten = res.substring(0, res.length() - 1);

        this.lop = lop;

        StringBuilder sb = new StringBuilder(ns);
        if (sb.charAt(1) == '/') sb.insert(0, '0');
        if (sb.charAt(4) == '/') sb.insert(3, '0');
        this.ns = sb.toString();

        this.gpa = gpa;
    }
    public String toString(){
        return this.msv + " " + this.ten + " " + this.lop + " " + this.ns + " " + String.format("%.2f", this.gpa);
    }
}

public class danhSachDoiTuongSinhVien2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ns = sc.nextLine();
            double gpa = sc.nextDouble();
            SinhVien sv = new SinhVien(i, ten, lop, ns, gpa);
            arr.add(sv);
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            public int compare(SinhVien a, SinhVien b){
                return Double.compare(b.gpa, a.gpa);
            }
        });
        for (SinhVien x : arr) System.out.println(x);
    }
}
