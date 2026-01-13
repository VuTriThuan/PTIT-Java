import java.util.Scanner;

class NhanVien{
    public String ma, ten, cv;
    public int lcb, ngay, lt, thuong, pc, tn;
    public NhanVien(String ten, int lcb, int ngay, String cv){
        ma = "NV01";

        this.ten = ten;
        this.lcb = lcb;
        this.ngay = ngay;
        this.cv = cv;

        lt = this.lcb * this.ngay;
        if (ngay >= 25) thuong = lt / 5;
        else if (ngay >= 22) thuong = lt / 10;
        
        if (this.cv.equals("GD")) pc = 250000;
        if (this.cv.equals("PGD")) pc = 200000;
        if (this.cv.equals("TP")) pc = 180000;
        if (this.cv.equals("NV")) pc = 150000;

        tn = lt + thuong + pc;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.lt + " " + this.thuong + " " + this.pc + " " + this.tn;
    }
}

public class baiToanTInhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int lcb = sc.nextInt();
        int ngay = sc.nextInt();
        sc.nextLine();
        String cv = sc.nextLine();
        NhanVien a = new NhanVien(ten, lcb, ngay, cv);
        System.out.println(a);
    }
}
