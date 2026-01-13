import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

class TuyenDung{
    public String ma, ten, ns, xl;
    public float d1, d2;
    public int tuoi, diem;
    public TuyenDung(int ma, String ten, String ns, float d1, float d2){
        this.ma = Integer.toString(ma);
        while (this.ma.length() < 2){
            this.ma = "0" + this.ma;
        }
        this.ma = "PH" + this.ma;

        String[] a = ten.trim().split("\\s+");
        String res = "";
        for (String x : a){
            res += x.substring(0,1).toUpperCase() + x.substring(1, x.length()).toLowerCase() + " ";
        }
        this.ten = res.substring(0, res.length() - 1);

        StringBuilder sb = new StringBuilder(ns);
        if (sb.charAt(1) == '/') sb.insert(0, '0');
        if (sb.charAt(4) == '/') sb.insert(3, '0');
        this.ns = sb.toString();

        this.d1 = d1;
        this.d2 = d2;

        tuoi = 2021 - Integer.valueOf(this.ns.substring(6, 10));

        float d = (d1 + d2) / 2;
        if (d1 >= 8 && d2 >= 8) d += 1;
        else if (d1 >= 7.5 && d2 >= 7.5) d += 0.6;
        diem = Math.round(d);
        if (diem > 10) diem = 10;
 
        if (diem < 5) xl = "Truot";
        if (diem == 5 || diem == 6) xl = "Trung binh";
        if (diem == 7) xl = "Kha";
        if (diem == 8) xl = "Gioi";
        if (diem == 9 || diem == 10) xl = "Xuat sac";
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.tuoi + " " + this.diem + " " + this.xl;
    }
}

public class xetTuyen {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        ArrayList<TuyenDung> arr = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            float d1 = sc.nextFloat();
            float d2 = sc.nextFloat();
            arr.add(new TuyenDung(i, ten, ns, d1, d2));
        }
        for (TuyenDung x : arr) System.out.println(x);
    }
}
