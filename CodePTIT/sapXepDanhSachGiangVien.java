import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class GiangVien{
    public String ma, ten, bm, fname;
    public GiangVien(int ma, String ten, String bm){
        this.ma = String.valueOf(ma);
        while (this.ma.length() < 2) this.ma = "0" + this.ma;
        this.ma = "GV" + this.ma;
        this.ten = ten;
        String[] a = ten.split("\\s+");
        fname = a[a.length - 1];
        String[] b = bm.toUpperCase().split("\\s+");
        this.bm = "";
        for (String x : b) this.bm += x.charAt(0);
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.bm;
    }
}

public class sapXepDanhSachGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiangVien> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= t; i++){
            arr.add(new GiangVien(i, sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<GiangVien>() {
            public int compare(GiangVien a, GiangVien b){
                if (a.fname.equals(b.fname)) return a.ma.compareTo(b.ma);
                return a.fname.compareTo(b.fname);
            }
        });
        for (GiangVien x : arr) System.out.println(x);
    }
}
// 3
// Nguyen Manh Son
// Cong nghe phan mem
// Vu Hoai Nam
// Khoa hoc may tinh
// Dang Minh Tuan
// An toan thong tin
