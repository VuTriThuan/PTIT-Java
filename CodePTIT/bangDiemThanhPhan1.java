import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class BangDiem{
    public String ma, ten, lop;
    public float d1, d2, d3;
    public BangDiem(String ma, String ten, String lop, float d1, float d2, float d3){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + String.format(" %.1f %.1f %.1f", d1, d2, d3);
    }
}

public class bangDiemThanhPhan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BangDiem> arr = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++){
            sc.nextLine();
            arr.add(new BangDiem(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
        }
        Collections.sort(arr, new Comparator<BangDiem>() {
            public int compare(BangDiem a, BangDiem b){
                return a.ten.compareTo(b.ten);
            }
        });
        for (int i = 0; i < arr.size(); i++){
            System.out.println((i + 1) + " " + arr.get(i));
        }
    }
}

// 3
// B20DCCN999
// Nguyen Van Nam
// D20CQCN04-B
// 10,0
// 9,0
// 8,0
// B20DCAT001
// Le Van An
// D20CQAT02-B
// 6,0
// 6,0
// 4,0
// B20DCCN111
// Nguyen Van Binh
// D20CQCN01-B
// 9,0
// 5,0
// 6,0