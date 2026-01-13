import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DoanhNghiep{
    public String ma, ten;
    public int sl;
    public DoanhNghiep(String ma, String ten, int sl){
        this.ma = ma; 
        this.ten = ten;
        this.sl = sl;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.sl;
    }
}

public class dsDNNhanSVThucTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0){
            sc.nextLine();
            arr.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(arr, new Comparator<DoanhNghiep>() {
            public int compare(DoanhNghiep a, DoanhNghiep b){
                if (a.sl == b.sl) return a.ma.compareTo(b.ma);
                return b.sl - a.sl;
            }
        });
        int q = sc.nextInt();
        while (q-- > 0){
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for (DoanhNghiep x : arr){
                if (x.sl >= a && x.sl <= b) System.out.println(x);
            }
        }
    }
}

// 4
// VIETTEL
// TAP DOAN VIEN THONG QUAN DOI VIETTEL
// 40
// FSOFT
// CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
// 300
// VNPT
// TAP DOAN BUU CHINH VIEN THONG VIET NAM
// 200
// SUN
// SUN*
// 50
// 1
// 30 50
