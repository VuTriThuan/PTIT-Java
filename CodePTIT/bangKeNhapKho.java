import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class HangHoa{
    public String ma, ten;
    public long sl, gia, chietKhau, thanhTien;
    public HangHoa(String ma, String ten, long sl, long gia){
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.gia = gia;
        thanhTien = sl * gia;
        if (sl > 10) chietKhau = thanhTien * 5 /100;
        else if (sl >= 8) chietKhau = thanhTien * 2 / 100;
        else if (sl >= 5) chietKhau = thanhTien / 100;
        else chietKhau = 0;
        thanhTien -= chietKhau;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.chietKhau + " " + this.thanhTien;
    }
}

public class bangKeNhapKho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<HangHoa> arr = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0){
            sc.nextLine();
            String ten = sc.nextLine();
            long sl = sc.nextLong(), gia = sc.nextLong();
            String[] a = ten.split("\\s+");
            String res = String.valueOf(a[0].toUpperCase().charAt(0)) + String.valueOf(a[1].toUpperCase().charAt(0));
            if (hm.containsKey(res)){
                hm.replace(res, hm.get(res) + 1);
                res += "0" + String.valueOf(hm.get(res));
            }
            else{
                hm.put(res, 1);
                res += "0" + String.valueOf(hm.get(res));
            }
            arr.add(new HangHoa(res, ten, sl, gia));
        }
        Collections.sort(arr, new Comparator<HangHoa>() {
            public int compare(HangHoa a, HangHoa b){
                return Long.compare(b.chietKhau, a.chietKhau);
            }
        });
        for (HangHoa x : arr) System.out.println(x);
    }
}
// 3
// May lanh SANYO
// 12
// 4000000
// Dien thoai Samsung
// 30
// 3230000
// Dien thoai Nokia
// 18
// 1240000