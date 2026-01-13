import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class BangLuong{
    public String ma, ten, chucVu;
    public long luongNgay, soNgay, luongThang, thuong, phuCap, thucLinh;
    public BangLuong(int ma, String ten, long luongNgay, long soNgay, String chucVu){
        this.ma = String.valueOf(ma);
        while (this.ma.length() < 2) this.ma = "0" + this.ma;
        this.ma = "NV" + this.ma;

        this.ten = ten;
        this.luongNgay = luongNgay;
        this.soNgay = soNgay;
        this.chucVu = chucVu;
        luongThang = luongNgay * soNgay;

        if (soNgay >= 25) thuong = luongThang / 5;
        else if (soNgay >= 22) thuong = luongThang / 10;
        else luongNgay = 0;

        if (chucVu.equals("GD")) phuCap = 250000;
        if (chucVu.equals("PGD")) phuCap = 200000;
        if (chucVu.equals("TP")) phuCap = 180000;
        if (chucVu.equals("NV")) phuCap = 150000;

        thucLinh = luongThang + thuong + phuCap;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.luongThang + " " + this.thuong + " " + this.phuCap + " " + this.thucLinh;
    }
}

public class bangKeTienLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BangLuong> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++){
            String ten = sc.nextLine();
            long luongNgay = sc.nextLong(), soNgay = sc.nextLong();
            sc.nextLine();
            String chucVu = sc.nextLine();
            arr.add(new BangLuong(i, ten, luongNgay, soNgay, chucVu));
        }
        Collections.sort(arr, new Comparator<BangLuong>() {
            public int compare(BangLuong a, BangLuong b){
                return Long.compare(b.thucLinh, a.thucLinh);
            }
        });
        long tong = 0;
        for (BangLuong x : arr){
            System.out.println(x);
            tong += x.thucLinh;
        }
        //System.out.println("Tong chi phi tien luong: " + tong);
    }
}
// 5
// Cao Van Vu
// 50000
// 26
// GD
// Bui Thi Trang
// 45000
// 23
// PGD
// Do Van Truong
// 40000
// 25
// PGD
// Nguyen Van Cam
// 37000
// 26
// TP
// Truong Thi Tu Linh
// 45000
// 22
// NV