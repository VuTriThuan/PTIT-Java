import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class KhachHang{
    public String ma, ten, loai;
    public double dau, cuoi, t, trongDm, NgoaiDm, thue;
    public KhachHang(int ma, String ten, String infor){
        this.ma = Integer.toString(ma);
        while (this.ma.length() < 2){
            this.ma = "0" + this.ma;
        }
        this.ma = "KH" + this.ma;

        String[] a = ten.trim().split("\\s+");
        String res = "";
        for (String x : a){
            res += x.substring(0,1).toUpperCase() + x.substring(1, x.length()).toLowerCase() + " ";
        }
        this.ten = res.substring(0, res.length() - 1);

        String[] s = infor.trim().split("\\s+");
        loai = s[0];
        dau = Double.valueOf(s[1]);
        cuoi = Double.valueOf(s[2]);
        t = 0;
        if (loai.equals("A")){
            trongDm = cuoi - dau;
            if (trongDm < 100) trongDm = (cuoi - dau) * 450;
            else{
                trongDm = 100 * 450;
                NgoaiDm = (cuoi - dau - 100) * 1000;
                thue = NgoaiDm * 0.05;
            }
            t = trongDm + NgoaiDm + thue;
        }
        if (loai.equals("B")){
            trongDm = cuoi - dau;
            if (trongDm < 500) trongDm = (cuoi - dau) * 450;
            else{
                trongDm = 500 * 450;
                NgoaiDm = (cuoi - dau - 500) * 1000;
                thue = NgoaiDm * 0.05;
            }
            t = trongDm + NgoaiDm + thue;
        }
        if (loai.equals("C")){
            trongDm = cuoi - dau;
            if (trongDm < 200) trongDm = (cuoi - dau) * 450;
            else{
                trongDm = 200 * 450;
                NgoaiDm = (cuoi - dau - 200) * 1000;
                thue = NgoaiDm * 0.05;
            }
            t = trongDm + NgoaiDm + thue;
        }
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + Math.round(this.trongDm) + " " + Math.round(this.NgoaiDm) + " " + Math.round(this.thue) + " " + Math.round(this.t);
    }
}

public class tinhTienDien {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SV.in"));
        ArrayList<KhachHang> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++){
            String ten = sc.nextLine();
            String infor = sc.nextLine();
            arr.add(new KhachHang(i, ten, infor));
        }
        Collections.sort(arr, new Comparator<KhachHang>() {
            public int compare(KhachHang a, KhachHang b){
                return Double.compare(b.t, a.t);
            }
        });
        for (KhachHang x : arr) System.out.println(x);
    }
}
