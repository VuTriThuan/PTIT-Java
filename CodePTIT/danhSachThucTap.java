import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien{
    public int tt;
    public String ma, ten, lop, email, dn;
    public SinhVien(int tt, String ma, String ten, String lop, String email, String dn){
        this.tt = tt;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }
    public String toString(){
        return this.tt + " " + this.ma + " " + this.ten + " " + this.lop + " " + this.email + " " + this.dn;
    }
}

public class danhSachThucTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++){
            arr.add(new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            public int compare(SinhVien a, SinhVien b){
                return a.ma.compareTo(b.ma);
            }
        });
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0){
            String s = sc.nextLine();
            for (SinhVien x : arr){
                if (x.dn.equals(s)) System.out.println(x);
            }
        }
    }
}
// 6
// B17DCCN016 
// Le Khac Tuan Anh 
// D17HTTT2   
// test1@stu.ptit.edu.vn
// VIETTEL
// B17DCCN107 
// Dao Thanh Dat    
// D17CNPM5   
// test2@stu.ptit.edu.vn
// FPT
// B17DCAT092 
// Cao Danh Huy     
// D17CQAT04-B
// test3@stu.ptit.edu.vn
// FPT
// B17DCCN388 
// Cao Sy Hai Long  
// D17CNPM2   
// test4@stu.ptit.edu.vn
// VNPT
// B17DCCN461 
// Dinh Quang Nghia 
// D17CNPM2   
// test5@stu.ptit.edu.vn
// FPT
// B17DCCN554 
// Bui Xuan Thai    
// D17CNPM1   
// test6@stu.ptit.edu.vn
// GAMELOFT
// 1
// FPT
