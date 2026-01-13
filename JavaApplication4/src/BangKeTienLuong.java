
import java.util.ArrayList;
import java.util.Scanner;

class NhanVien{
    public String ten, cv, ma;
    public int lcb, lt, ngay, thuong, pccv, tong;
    public NhanVien(int ma, String ten, int lcb, int ngay, String cv){
        this.ma = String.valueOf(ma);
        while (this.ma.length() < 2) this.ma = "0" + this.ma;
        this.ma = "NV" + this.ma;
        
        this.ten = ten;
        this.cv = cv;
        this.lcb = lcb;
        this.ngay = ngay;
        
        this.lt = this.lcb * this.ngay;
        
        if (this.ngay >= 25) this.thuong = this.lt / 5;
        else if (this.ngay >= 22) this.thuong = this.lt / 10;
        
        if (this.cv.equals("GD")) this.pccv = 250000;
        if (this.cv.equals("PGD")) this.pccv = 200000;
        if (this.cv.equals("TP")) this.pccv = 180000;
        if (this.cv.equals("NV")) this.pccv = 150000;
        
        this.tong = this.lt + this.thuong + this.pccv;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.lt + " " + this.thuong + " " + this.pccv + " " + this.tong;
    }
}

public class BangKeTienLuong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for (int i = 0; i < t; i++){
            String ten = sc.nextLine();
            int lcb = sc.nextInt();
            int ngay = sc.nextInt();
            sc.nextLine();
            String cv = sc.nextLine();
            arr.add(new NhanVien(i + 1, ten, lcb, ngay, cv));
        }
        int tongnv = 0;
        for (NhanVien x : arr){
            System.out.println(x);
            tongnv += x.tong;
        }
        System.out.println("Tong chi phi tien luong: " + tongnv);
    }
}
//5
//Cao Van Vu
//50000
//26
//GD
//Bui Thi Trang
//45000
//23
//PGD
//Do Van Truong
//40000
//25
//PGD
//Nguyen Van Cam
//37000
//26
//TP
//Truong Thi Tu Linh
//45000
//22
//NV