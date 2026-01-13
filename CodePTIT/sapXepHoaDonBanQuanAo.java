import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham{
    public String maSP, ten;
    public long gia1, gia2;
    public SanPham(String maSP, String ten, long gia1, long gia2){
        this.maSP = maSP;
        this.ten = ten;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }
    public String toString(){
        return this.ten;
    }
}

class HoaDon{
    SanPham sp;
    public String maHD;
    public long sl, soTien, giam;
    public HoaDon(int tt, SanPham sp, String maHD, long sl){
        this.sp = sp;
        this.maHD = String.valueOf(tt);
        while (this.maHD.length() < 3) this.maHD = "0" + this.maHD;
        this.maHD = maHD + "-" + this.maHD;
        this.sl = sl;
        if (maHD.charAt(2) == '1') soTien = sl * sp.gia1;
        else soTien = sl * sp.gia2;
        giam = 0;
        if (sl >= 150) giam = soTien / 2;
        else if (sl >= 100) giam = soTien * 30 / 100;
        else if (sl >= 50) giam = soTien * 15 / 100;
        soTien -= giam;
    }
    public String toString(){
        return this.maHD + " " + this.sp + " " + this.giam + " " + this.soTien;
    }
}

public class sapXepHoaDonBanQuanAo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> a = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            a.add(new SanPham(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        ArrayList<HoaDon> b = new ArrayList<>();
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < m; i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            String maHD = s[0];
            long sl = Long.valueOf(s[1]);
            for (int j = 0; j < n; j++){
                if (maHD.substring(0,2).equals(a.get(j).maSP)){
                    b.add(new HoaDon(i + 1, a.get(j), maHD, sl));
                    break;
                }
            }
        }
        Collections.sort(b, new Comparator<HoaDon>() {
            public int compare(HoaDon a, HoaDon b){
                return Long.compare(b.soTien, a.soTien);
            }
        });
        for (HoaDon x : b) System.out.println(x);
    }
}
// 2
// AT
// Ao thun
// 80000
// 45000
// QJ
// Quan Jean
// 220000
// 125000
// 2
// AT1 95
// QJ2 105
