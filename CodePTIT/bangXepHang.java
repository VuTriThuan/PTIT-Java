import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien{
    public String ten;
    public int ac, sm;
    public SinhVien(String ten, int ac, int sm){
        this.ten = ten;
        this.ac = ac;
        this.sm = sm;
    }
    public String toString(){
        return this.ten + " " + this.ac + " " + this.sm;
    }
}

public class bangXepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        int n = sc.nextInt();
        while (n-- > 0){
            sc.nextLine();
            arr.add(new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr, new Comparator<SinhVien>() {
            public int compare(SinhVien a, SinhVien b){
                if (a.ac == b.ac){
                    if (a.sm == b.sm) return a.ten.compareTo(b.ten);
                    return a.sm - b.sm;
                }
                return b.ac - a.ac;
            }
        });
        for (SinhVien x : arr) System.out.println(x);
    }
}

// 2
// Nguyen Van Nam
// 168 600
// Tran Thi Ngoc
// 168 600
