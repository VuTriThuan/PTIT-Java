import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class GiangVien{
    public String ma, ten, bm;
    public GiangVien(int ma, String ten, String bm){
        this.ma = String.valueOf(ma);
        while (this.ma.length() < 2) this.ma = "0" + this.ma;
        this.ma = "GV" + this.ma;
        this.ten = ten;
        String[] b = bm.toUpperCase().split("\\s+");
        this.bm = "";
        for (String x : b) this.bm += x.charAt(0);
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.bm;
    }
}

public class timKiemGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiangVien> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++){
            arr.add(new GiangVien(i, sc.nextLine(), sc.nextLine()));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0){
            String res = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + res + ":");
            res = res.toLowerCase();
            int cnt = res.length();
            for (GiangVien x : arr){
                for (int i = 0; i < x.ten.length() - cnt + 1; i++){
                    if (x.ten.toLowerCase().substring(i, i + cnt).equals(res)){
                        System.out.println(x);
                        break;
                    }
                }
            }
        }
    }
}
// 3
// Nguyen Manh Son
// Cong nghe phan mem
// Vu Hoai Nam
// Khoa hoc may tinh
// Dang Minh Tuan
// An toan thong tin
// 1
// aN
