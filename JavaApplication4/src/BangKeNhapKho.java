
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class MatHang{
    public String ma, ten;
    public int sl, gia, ck, thanhTien;
    public MatHang(String ma, String ten, int sl, int gia){
        this.ma = ma; 
        this.ten = ten;
        this.sl = sl;
        this.gia = gia;
        
        if (this.sl > 10) this.ck = this.gia * this.sl / 20;
        else if (this.sl >= 8) this.ck = this.gia * this.sl / 50;
        else if (this.sl >= 5) this.ck = this.gia * this.sl / 100;
        else this.ck = 0;
        
        this.thanhTien = this.gia * this.sl - this.ck;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.ck + " " + this.thanhTien;
    }
}


public class BangKeNhapKho {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MatHang> arr = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();
        while (t-- > 0){
            sc.nextLine();
            String ten = sc.nextLine();
            int sl = sc.nextInt();
            int gia = sc.nextInt();
            
            String[] a = ten.trim().split("\\s+");
            String res = a[0].substring(0,1).toUpperCase() + a[1].substring(0,1).toUpperCase();
            if (mp.containsKey(res)) mp.replace(res, mp.get(res) + 1);
            else mp.put(res, 1);
            String ma = res + "0" + String.valueOf(mp.get(res));
            
            arr.add(new MatHang(ma, ten, sl, gia));
        }
        for (MatHang x : arr) System.out.println(x);
    }
}
//3
//May lanh SANYO
//12
//4000000
//Dien thoai Samsung
//30
//3230000
//Dien thoai Nokia
//18
//1240000