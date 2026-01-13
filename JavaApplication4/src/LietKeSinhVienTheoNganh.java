
import java.util.ArrayList;
import java.util.Scanner;

class SinhVien{
    public String ma, ten, lop, email, nganh;
    public SinhVien(String ma, String ten, String lop, String email){
        this.ma = ma; 
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        
        this.nganh = "";
        String s = ma.substring(3, 7);
        if (s.equals("DCKT")) this.nganh = "KE TOAN";
        if (s.equals("DCCN") && lop.charAt(0) != 'E') this.nganh = "CONG NGHE THONG TIN";
        if (s.equals("DCAT") && lop.charAt(0) != 'E') this.nganh = "AN TOAN THONG TIN";
        if (s.equals("DCVT")) this.nganh = "VIEN THONG";
        if (s.equals("DCDT")) this.nganh = "DIEN TU";
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
    }
}

public class LietKeSinhVienTheoNganh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
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
        
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String s = sc.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + s + ":");
            for (SinhVien x : arr){
                if (x.nganh.equals(s)) System.out.println(x);
            }
        }
    }
}

//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//Ke toan