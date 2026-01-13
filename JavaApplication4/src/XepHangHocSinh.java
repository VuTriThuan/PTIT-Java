
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class HocSinh{
    public String ma, ten, xl;
    public double diem;
    public int xh;
    public HocSinh(int ma, String ten, double diem){
        this.ma = String.valueOf(ma);
        while (this.ma.length() < 2) this.ma = "0" + this.ma;
        this.ma = "HS" + this.ma;
        
        this.ten = ten;
        this.diem = diem;
        this.xh = 0;
        
        if (this.diem < 5) this.xl = "Yeu";
        else if (this.diem < 7) this.xl = "Trung Binh";
        else if (this.diem < 9) this.xl = "Kha";
        else this.xl = "Gioi";
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + String.format("%.1f", this.diem) + " " + this.xl + " " + this.xh;
    }
}

public class XepHangHocSinh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<HocSinh> arr = new ArrayList<>();
        for (int i = 0; i < t; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            double diem = sc.nextDouble();
            arr.add(new HocSinh(i+1, ten, diem));
        }
        Collections.sort(arr, new Comparator<HocSinh>(){
            public int compare(HocSinh a, HocSinh b){
                return Double.compare(b.diem, a.diem);
            }
        });
        for (int i = 0; i < t; i++){
            if (i > 0 && arr.get(i).diem == arr.get(i-1).diem){
                arr.get(i).xh = arr.get(i-1).xh;
            } 
            else arr.get(i).xh = i+1;
        }
        Collections.sort(arr, new Comparator<HocSinh>(){
            public int compare(HocSinh a, HocSinh b){
                return a.ma.compareTo(b.ma);
            }
        });
        for (HocSinh x : arr) System.out.println(x);
    }
}
//
//3
//Tran Minh Hieu
//5,9
//Nguyen Bao Trung
//8,6
//Le Hong Ha
//9,2