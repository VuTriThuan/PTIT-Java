import java.io.File;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class KhachHang{
    public String ma, ten, phong, nhan, tra;
    public int dv;
    public long t, day;
    public KhachHang(String ma, String ten, String phong, String nhan, String tra, int dv){
        this.ma = ma;
        this.ten = ten;
        this.phong = phong;
        this.nhan = nhan;
        this.tra = tra;
        this.dv = dv;
    }
    public void chuanHoa(){
        String[] a = this.ten.trim().split("\\s+");
        String res = "";
        for (String x : a){
            res += x.substring(0, 1).toUpperCase() + x.substring(1, x.length()).toLowerCase() + " ";
        }
        this.ten = res.substring(0, res.length() - 1);

        StringBuilder sb1 = new StringBuilder(this.nhan);
        if (sb1.charAt(1) == '/') sb1.insert(0, '0');
        if (sb1.charAt(4) == '/') sb1.insert(3, '0');
        this.nhan = sb1.toString();

        StringBuilder sb2 = new StringBuilder(this.tra);
        if (sb2.charAt(1) == '/') sb2.insert(0, '0');
        if (sb2.charAt(4) == '/') sb2.insert(3, '0');
        this.tra = sb2.toString();

        t = this.dv;
        LocalDate d1 = LocalDate.of(Integer.valueOf(this.nhan.substring(6, 10)), Integer.valueOf(this.nhan.substring(3, 5)), Integer.valueOf(this.nhan.substring(0, 2)));
        LocalDate d2 = LocalDate.of(Integer.valueOf(this.tra.substring(6, 10)), Integer.valueOf(this.tra.substring(3, 5)), Integer.valueOf(this.tra.substring(0, 2)));
        day = ChronoUnit.DAYS.between(d1, d2) + 1;
        if (this.phong.charAt(0) == '1'){
            t += day * 25;
        }
        else if (this.phong.charAt(0) == '2'){
            t += day * 34;
        }
        else if (this.phong.charAt(0) == '3'){
            t += day * 50;
        }
        if (this.phong.charAt(0) == '4'){
            t += day * 80;
        }
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.phong + " " + this.day + " " + this.t;
    }
}

public class tinhTienPhong {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<KhachHang> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            String ma = Integer.toString(i);
            while (ma.length() < 2){
                ma = "0" + ma;
            }
            ma = "KH" + ma;
            String ten = sc.nextLine();
            String phong = sc.nextLine();
            String nhan = sc.nextLine();
            String tra = sc.nextLine();
            int dv = sc.nextInt();
            KhachHang k = new KhachHang(ma, ten, phong, nhan, tra, dv);
            k.chuanHoa();
            arr.add(k);
        }
        Collections.sort(arr, new Comparator<KhachHang>() {
            public int compare(KhachHang a, KhachHang b){
                return (int)(b.t) - (int)(a.t);
            }
        });
        for (KhachHang x : arr) System.out.println(x);
    }
}
