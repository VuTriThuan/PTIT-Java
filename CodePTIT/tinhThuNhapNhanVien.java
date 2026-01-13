import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class NhanVien{
    public String ma, ten, cv;
    public long luongNgay, soNgay, pc, luongChinh, tamUng, conLai, thuNhap;
    public NhanVien(int ma, String ten, String cv, long luongNgay, long soNgay){
        this.ma = String.valueOf(ma);
        while (this.ma.length() < 2) this.ma = "0" + this.ma;
        this.ma = "NV" + this.ma;

        this.ten = ten;
        this.cv = cv;
        this.luongNgay = luongNgay;
        this.soNgay = soNgay;

        luongChinh = luongNgay * soNgay;

        if (cv.equals("GD")) pc = 500;
        else if (cv.equals("PGD")) pc = 400;
        else if (cv.equals("TP")) pc = 300;
        else if (cv.equals("KT")) pc = 250;
        else pc = 100;

        thuNhap = luongChinh + pc;
        
        if ((luongChinh + pc) * 2 / 3 < 25000) tamUng = Math.round((double)(luongChinh+pc)*2/3000)*1000;
        else tamUng = 25000;

        conLai = luongChinh + pc - tamUng;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.pc + " " + this.luongChinh + " " + this.tamUng + " " + this.conLai;
    }
}

public class tinhThuNhapNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            arr.add(new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(arr, new Comparator<NhanVien>() {
            public int compare(NhanVien a, NhanVien b){
                if (a.thuNhap == b.thuNhap) return a.ma.compareTo(b.ma);
                return Long.compare(b.thuNhap, a.thuNhap);
            }
        });
        for (NhanVien x : arr){
            System.out.println((x));
        }
    }
}
// 4
// Tran Thi Yen
// NV
// 1000
// 24
// Nguyen Van Thanh
// BV
// 1000
// 30
// Doan Truong An
// TP
// 3000
// 25
// Le Thanh
// GD
// 5000
// 28
