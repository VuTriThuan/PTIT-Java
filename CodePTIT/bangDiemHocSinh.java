import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class BangDiem{
    public String ten, ma, xl;
    public double tong;
    public BangDiem(int ma, String ten, double tong){
        this.ma = String.valueOf(ma);
        while (this.ma.length() < 2) this.ma = "0" + this.ma;
        this.ma = "HS" + this.ma;
        this.ten = ten;
        this.tong = Math.round((tong / 12) * 10) / 10.0;
        if (this.tong < 5) xl = "YEU";
        else if (this.tong <= 6.9) xl = "TB";
        else if (this.tong <= 7.9) xl = "KHA";
        else if (this.tong <= 8.9) xl = "GIOI";
        else xl = "XUAT SAC";
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + String.format("%.1f", this.tong) + " " + this.xl;
    }
}

public class bangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BangDiem> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            String ten = sc.nextLine();
            String[] diemStr = sc.nextLine().split("\\s+");
            double tong = 0;
            for (int j = 0; j < 10; j++) {
                double diem = Double.parseDouble(diemStr[j]);
                if (j < 2) tong += diem * 2;
                else tong += diem;
            }
            arr.add(new BangDiem(i, ten, tong));
        }
        Collections.sort(arr, new Comparator<BangDiem>() {
            public int compare(BangDiem a, BangDiem b){
                if (a.tong == b.tong) return a.ma.compareTo(b.ma);
                return Double.compare(b.tong, a.tong);
            }
        });
        for (BangDiem x : arr) System.out.println(x);
    }
}
// 3
// Luu Thuy Nhi
// 9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
// Le Van Tam
// 8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
// Nguyen Thai Binh
// 9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
