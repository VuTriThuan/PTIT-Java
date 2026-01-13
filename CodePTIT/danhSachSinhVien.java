import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien{
    public String ten, lop, mail, msv;
    public SinhVien(String msv, String ten, String lop, String mail){
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }
    public void chuanHoa(){
        String[] a = (this.ten).trim().split("\\s+");
        String res = "";
        for (String x : a){
            res += x.substring(0, 1).toUpperCase() + x.substring(1, x.length()).toLowerCase() + " ";
        }
        this.ten = res;
    }
    public String toString(){
        return this.msv + " " + this.ten + this.lop + " " + this.mail;
    }
}

public class danhSachSinhVien {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            SinhVien sv = new SinhVien(msv, ten, lop, mail);
            sv.chuanHoa();
            arr.add(sv);
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            public int compare(SinhVien a, SinhVien b){
                return a.msv.compareTo(b.msv);
            }
        });
        for (SinhVien x : arr) System.out.println(x);
    }
}
