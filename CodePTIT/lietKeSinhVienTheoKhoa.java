import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien{
    public String ma, ten, lop, email;
    public SinhVien(String ma, String ten, String lop, String email){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
    }
}

public class lietKeSinhVienTheoKhoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0){
            arr.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0){
            String khoa = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + khoa + ":");
            for (SinhVien x : arr){
                if (x.lop.substring(1,3).equals(khoa.substring(2, 4))){
                    System.out.println(x);
                }
            }
        }
    }
}
// 4
// B16DCCN011
// Nguyen Trong Duc Anh
// D16CNPM1
// sv1@stu.ptit.edu.vn
// B15DCCN215
// To Ngoc Hieu
// D15CNPM3
// sv2@stu.ptit.edu.vn
// B15DCKT150
// Nguyen Ngoc Son
// D15CQKT02-B
// sv3@stu.ptit.edu.vn
// B15DCKT199
// Nguyen Trong Tung
// D15CQKT02-B
// sv4@stu.ptit.edu.vn
// 1
// 2015
