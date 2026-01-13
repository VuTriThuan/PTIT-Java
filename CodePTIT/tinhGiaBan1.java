import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang{
    public String ma, ten, dv;
    public long nhap, sl, vc, tt, ban;
    public MatHang(int ma, String ten, String dv, long nhap, long sl){
        this.ma = String.valueOf(ma);
        while (this.ma.length() < 2) this.ma = "0" + this.ma;
        this.ma = "MH" + this.ma;
        this.ten = ten;
        this.dv = dv;
        this.nhap = nhap;
        this.sl = sl;
        vc = Math.round((Double)(nhap * sl * 0.05));
        tt = nhap * sl + vc;
        ban = Math.round((Double)(tt * 1.02 / sl));
        if (ban % 100 != 0) ban = ban - ban % 100 + 100;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.dv + " " + this.vc + " " + this.tt + " " + this.ban;
    }
}

public class tinhGiaBan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            arr.add(new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(arr, new Comparator<MatHang>() {
            public int compare(MatHang a, MatHang b){
                return Long.compare(b.ban, a.ban);
            }
        });
        for (MatHang x : arr) System.out.println(x);
    }
}
// 4
// DUONG
// KG
// 7500
// 150
// TRUNG
// CHUC
// 10000
// 225
// GAO
// KG
// 14000
// 118
// SUA
// HOP
// 48000
// 430