import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class ThoiGian{
    public String ma, ten, s, e;
    public int gio, phut;
    public ThoiGian(String ma, String ten, String s, String e){
        this.ma = ma; 
        this.ten = ten; 
        this.s = s;
        this.e = e;
        gio = Integer.valueOf(e.substring(0,2)) - Integer.valueOf(s.substring(0,2));
        phut = Integer.valueOf(e.substring(3,5)) - Integer.valueOf(s.substring(3,5));
        if (phut < 0){
            gio--;
            phut = 60 + phut;
        }
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.gio + " gio " + this.phut + " phut";
    }
}

public class tinhGio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<ThoiGian> arr = new ArrayList<>();
        while (t-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String s = sc.nextLine();
            String e = sc.nextLine();
            arr.add(new ThoiGian(ma, ten, s, e));
        }
        Collections.sort(arr, new Comparator<ThoiGian>() {
            public int compare(ThoiGian a, ThoiGian b){
                if (a.gio == b.gio) return b.phut - a.phut;
                return b.gio - a.gio;
            }
        });
        for (ThoiGian x : arr) System.out.println(x);
    }
}
// 3
// 01T
// Nguyen Van An
// 09:00
// 10:30
// 06T
// Hoang Van Nam
// 15:30
// 18:00
// 02I
// Tran Hoa Binh
// 09:05
// 09:07