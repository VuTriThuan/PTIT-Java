import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class HangHoa{
    public String ma;
    public long nhap, xuat, donGia, tien, thue;
    public HangHoa(String ma, long nhap){
        this.ma = ma;
        this.nhap = nhap;
        
        char dau = ma.charAt(0);
        char cuoi = ma.charAt(ma.length() - 1);
        if (dau == 'A') xuat = Math.round(nhap * 0.6);
        if (dau == 'B') xuat = Math.round(nhap * 0.7);

        if (cuoi == 'Y') donGia = 110000;
        if (cuoi == 'N') donGia = 135000;

        tien = xuat * donGia;

        if (dau == 'A' && cuoi == 'Y') thue = tien * 8 / 100;
        if (dau == 'A' && cuoi == 'N') thue = tien * 11 / 100;
        if (dau == 'B' && cuoi == 'Y') thue = tien * 17 / 100;
        if (dau == 'B' && cuoi == 'N') thue = tien * 22 / 100;
    }
    public String toString(){
        return this.ma + " " + this.nhap + " " + this.xuat + " " + this.donGia + " " + this.tien + " " + this.thue;
    }
}

public class bangTheoDoiNhapXuatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HangHoa> arr = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0){
            sc.nextLine();
            arr.add(new HangHoa(sc.nextLine(), sc.nextLong()));
        }
        Collections.sort(arr, new Comparator<HangHoa>() {
            public int compare(HangHoa a, HangHoa b){
                return Long.compare(b.thue, a.thue);
            }
        });
        sc.nextLine();
        String s = sc.nextLine();
        for (HangHoa x : arr){
            if (x.ma.substring(0, 1).equals(s)) System.out.println(x);
        }
    }
}
// 3
// A001Y
// 1000
// B012N
// 2500
// B003Y
// 4582