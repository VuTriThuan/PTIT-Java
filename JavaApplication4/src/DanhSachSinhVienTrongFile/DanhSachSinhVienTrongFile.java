
package DanhSachSinhVienTrongFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien{
    public String ma, ten, lop, email;
    public SinhVien(String ma, String ten, String lop, String email){
        this.ten = "";
        String[] a = ten.trim().toLowerCase().split("\\s+");
        for (String x : a){
            this.ten += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        }
        
        this.ma = ma;
        this.lop = lop;
        this.email = email;
    }
    public String toString(){
        return this.ma + " " + this.ten + this.lop + " " + this.email;
    }
}

public class DanhSachSinhVienTrongFile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < t; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            arr.add(new SinhVien(ma, ten, lop, email));
        }
        Collections.sort(arr, new Comparator<SinhVien>(){
            public int compare(SinhVien a, SinhVien b){
                return a.ma.compareTo(b.ma);
            }
        });
        for (SinhVien x : arr){
            System.out.println(x);
        }
    }
}
