import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DonHang{
    public String ma, ten, stt;
    public long donGia, sl, giam, tt;
    public DonHang(String ten, String ma, long donGia, long sl){
        this.ten = ten;
        this.ma = ma;
        this.donGia = donGia;
        this.sl = sl;
        stt = ma.substring(1,4);
        tt = donGia * sl;
        if (ma.charAt(4) == '1') giam = tt / 2;
        if (ma.charAt(4) == '2') giam = tt * 3 / 10;
        tt -= giam;
    }
    public String toString(){
        return this.ten + " " + this.ma + " " + this.stt + " " + this.giam + " " + this.tt;
    }
}

public class traCuuDonHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DonHang> arr = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0){
            sc.nextLine();
            arr.add(new DonHang(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(arr, new Comparator<DonHang>() {
            public int compare(DonHang a, DonHang b){
                return a.stt.compareTo(b.stt);
            }
        });
        for (DonHang x : arr) System.out.println(x);
    }
}
// 3
// Kaki 2
// K0252
// 80000
// 15
// Jean 1
// J2011
// 200000
// 24
// Jean 2
// J0982
// 150000
// 12