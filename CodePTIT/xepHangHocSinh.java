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
        if (diem < 5) xl = "Yeu";
        else if (diem < 7) xl = "Trung Binh";
        else if (diem < 9) xl = "Kha";
        else xl = "Gioi";
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + String.format("%.1f", diem) + " " + this.xl + " " + this.xh;
    }
}

public class xepHangHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HocSinh> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            arr.add(new HocSinh(i, sc.nextLine(), sc.nextDouble()));
        }
        
        //xep hang
        Collections.sort(arr, new Comparator<HocSinh>() {
            public int compare(HocSinh a, HocSinh b){
                return Double.compare(b.diem, a.diem);
            }
        });
        int cnt = 1;
        arr.get(0).xh = 1;
        for (int i = 1; i < n; i++){
            if (arr.get(i).diem == arr.get(i - 1).diem) arr.get(i).xh = arr.get(i - 1).xh;
            else arr.get(i).xh = cnt + 1;
            cnt++;
        }

        //sap xep theo thu tu ban dau
        Collections.sort(arr, new Comparator<HocSinh>() {
            public int compare(HocSinh a, HocSinh b){
                return a.ma.compareTo(b.ma);
            }
        });
        for (HocSinh x : arr) System.out.println(x);
    }
}
// 3
// Tran Minh Hieu
// 5,9
// Nguyen Bao Trung
// 8,6
// Le Hong Ha
// 9,2