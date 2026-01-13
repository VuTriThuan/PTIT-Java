import java.util.Scanner;

class PhanSo{
    public long tu, mau;
    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public static void rutGon(PhanSo p){
        long a = p.tu, b = p.mau;
        while (b != 0){
            long tmp = a;
            a = b;
            b = tmp % b;
        }
        p.tu /= a;
        p.mau /= a;
    }
    public PhanSo solve1(PhanSo b){
        PhanSo c = new PhanSo(this.tu*b.mau+this.mau*b.tu, this.mau*b.mau);
        PhanSo.rutGon(c);
        return new PhanSo(c.tu*c.tu, c.mau*c.mau);
    }
    public PhanSo solve2(PhanSo b, PhanSo c){
        PhanSo d = new PhanSo(this.tu*b.tu*c.tu, this.mau*b.mau*c.mau);
        PhanSo.rutGon(d);
        return d;
    }
    public String toString(){
        return this.tu + "/" + this.mau;
    }
}

public class tinhToanPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long x1 = sc.nextLong(), y1 = sc.nextLong();
            long x2 = sc.nextLong(), y2 = sc.nextLong();
            PhanSo p1 = new PhanSo(x1, y1);
            PhanSo p2 = new PhanSo(x2, y2);
            System.out.println(p1.solve1(p2) + " " + p1.solve2(p2, p1.solve1(p2)));
        }
    }
}
