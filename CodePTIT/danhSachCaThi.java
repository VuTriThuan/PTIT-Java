import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class CaThi{
    public String ma, ngay, gio, phong;
    public CaThi(int ma, String ngay, String gio, String phong){
        this.ma = Integer.toString(ma);
        while (this.ma.length() < 3){
            this.ma = "0" + this.ma;
        }
        this.ma = "C" + this.ma;
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
    }
    public String toString(){
        return this.ma + " " + this.ngay + " " + this.gio + " " + this.phong;
    }
}

public class danhSachCaThi {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("CATHI.in"));
        ArrayList<CaThi> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++){
            String ngay = sc.nextLine();
            String gio = sc.nextLine();
            String phong = sc.nextLine();
            arr.add(new CaThi(i, ngay, gio, phong));
        }
        Collections.sort(arr, new Comparator<CaThi>() {
            public int compare(CaThi a, CaThi b){
                if (!a.ngay.substring(6, 10).equals(b.ngay.substring(6,10))){
                    return a.ngay.substring(6, 10).compareTo(b.ngay.substring(6,10));
                }
                if (!a.ngay.substring(3, 5).equals(b.ngay.substring(3,5))){
                    return a.ngay.substring(3, 5).compareTo(b.ngay.substring(3,5));
                }
                if (!a.ngay.substring(0, 2).equals(b.ngay.substring(0,2))){
                    return a.ngay.substring(0, 2).compareTo(b.ngay.substring(0,2));
                }
                if (!a.gio.substring(0, 2).equals(b.gio.substring(0,2))){
                    return a.gio.substring(0, 2).compareTo(b.gio.substring(0,2));
                }
                if (!a.gio.substring(3, 5).equals(b.gio.substring(3, 5))){
                    return a.gio.substring(3, 5).compareTo(b.gio.substring(3,5));
                }
                return a.ma.compareTo(b.ma);
            }
        });
        for (CaThi x : arr) System.out.println(x);
    }
}
