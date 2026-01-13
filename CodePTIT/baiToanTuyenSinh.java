import java.util.Scanner;

class ThiSinh{
    public String ma, ten, tt;
    public double d1, d2, d3, d, ut;
    public ThiSinh(String ma, String ten, double d1, double d2, double d3){
        this.ma = ma;
        this.ten = ten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        String kv = this.ma.substring(0, 3);
        if (kv.equals("KV1")) ut = 0.5;
        if (kv.equals("KV2")) ut = 1.0;
        if (kv.equals("KV3")) ut = 2.5;
        d = d1 * 2 + d2 + d3 + ut;
        if (d >= 24) tt = "TRUNG TUYEN";
        else tt = "TRUOT";
    }
    public String toString(){
        String res = this.ma + " " + this.ten + " ";
        if (this.ut == 1) res += String.format("%.0f", this.ut) + " ";
        else res += String.format("%.1f", this.ut) + " ";
        if ((int)(this.d - this.ut) == (this.d - this.ut)) res += String.format("%.0f", this.d - this.ut) + " ";
        else res += String.format("%.1f", this.d - this.ut) + " ";
        res += this.tt;
        return res;
    }
}

public class baiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        double d1 = sc.nextDouble(), d2 = sc.nextDouble(), d3 = sc.nextDouble();
        ThiSinh t = new ThiSinh(ma, ten, d1, d2, d3);
        System.out.println(t);
    }
}
