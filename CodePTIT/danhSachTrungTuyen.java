import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ThiSinh{
    public String ma, ten;
    public double toan, ly, hoa, diem, diemUT;
    public ThiSinh(String ma, String ten, double toan, double ly, double hoa){
        this.ma = ma;

        String res = "";    
        String[] a = ten.trim().split("\\s+");
        for (String x : a){
            res += x.substring(0,1).toUpperCase() + x.substring(1, x.length()).toLowerCase() + " ";
        }
        this.ten = res.substring(0, res.length() - 1);

        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;

        diemUT = 0;
        if (ma.charAt(2) == '1') diemUT = 0.5;
        else if (ma.charAt(2) == '2') diemUT = 1;
        else if (ma.charAt(2) == '3') diemUT = 2.5;
        diem = toan * 2 + ly + hoa + diemUT;
    }
    public void in(){
        System.out.print(this.ma + " " + this.ten + " ");
        if (this.diemUT * 10 == (int)(this.diemUT) * 10) System.out.print((int)this.diemUT + " ");
        else System.out.print(String.format("%.1f", this.diemUT) + " ");
        if (this.diem * 10 == (int)(this.diem) * 10) System.out.print((int)this.diem + " ");
        else System.out.print(String.format("%.1f", this.diem) + " ");
    }
}

public class danhSachTrungTuyen {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<ThiSinh> arr = new ArrayList<>();
        int n = sc.nextInt();
        while (n-- > 0){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            double toan = sc.nextDouble();
            double ly = sc.nextDouble();
            double hoa = sc.nextDouble();
            arr.add(new ThiSinh(ma, ten, toan, ly, hoa));
        }
        int k = sc.nextInt();
        Collections.sort(arr, new Comparator<ThiSinh>() {
            public int compare(ThiSinh a, ThiSinh b){
                if (a.diem == b.diem) return a.ma.compareTo(b.ma);
                return (int)(b.diem * 10) - (int)(a.diem * 10);
            }
        });
        double diemChuan = arr.get(k - 1).diem;
        System.out.println(diemChuan);

        for (ThiSinh x : arr){
            x.in();
            if (x.diem >= diemChuan) System.out.println("TRUNG TUYEN");
            else System.out.println("TRUOT");
            k--;
        }
    }
}
