import java.util.ArrayList;
import java.util.Scanner;

class Person{
    private String ten, ns, dc;
    public Person(){
        ten = ns = dc = "";
    }
    public Person(String ten, String ns, String dc){
        this.ten = ten;
        this.ns = ns;
        this.dc= dc;
    }
    public void chuanHoa(){
        //chuan hoa ten
        String[] arr = this.ten.split("\\s+");
        String res = "";
        for (String s : arr){
            res += Character.toUpperCase(s.charAt(0));
            for (int i = 1; i < s.length(); i++) res += Character.toLowerCase(s.charAt(i));
            res += " ";
        }
        this.ten = res;

        //chuan hoa ngay sinh
        StringBuilder sb = new StringBuilder(this.ns);
        if(sb.charAt(0) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        this.ns = sb.toString();
    }

    public String toString(){
        return this.ten + " " + this.ns + " " + this.dc;
    }
}

class Student extends Person{
    private String msv;
    private String lop;
    private double gpa;
    public Student(String msv, String ten, String ns, String dc, String lop, double gpa){
        super(ten, ns, dc);
        this.msv = msv;
        this.lop = lop;
        this. gpa = gpa;
    }
    public String toString(){
        return this.msv + " " + super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }
}

class Teacher extends Person{
    private String mgv, khoa;
    private int luong;
    public Teacher(String mgv, String ten, String ns, String dc, String khoa, int luong){
        super(ten, ns, dc);
        this.mgv = mgv;
        this.khoa = khoa;
        this.luong = luong;
    }
    public String toString(){
        return this.mgv + " " + super.toString() + " " + this.khoa + " " + this.luong;
    }
}

public class HDT_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arrS = new ArrayList<>();
        ArrayList<Teacher> arrT = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            String dc = sc.nextLine();
            if(ma.substring(0, 2).equals("GV")){
                String khoa = sc.nextLine();
                int luong = sc.nextInt();
                Teacher t = new Teacher(ma, ten, ns, dc, khoa, luong);
                t.chuanHoa();
                arrT.add(t);
            }
            else if (ma.substring(0, 2).equals("SV")){
                String lop = sc.nextLine();
                double gpa = sc.nextDouble();
                Student s = new Student(ma, ten, ns, dc, lop, gpa);
                s.chuanHoa();
                arrS.add(s);
            }
        }
        System.out.println("DANH SACH GIAO VIEN :");
        for (Teacher x : arrT){
            System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN :");
        for (Student x : arrS){
            System.out.println(x);
        }
    }
}

// 9
// GV1
// Nguyen duC TuaN
// 4/6/1977
// Thai Binh
// CNTT
// 12000000
// SV2
// Luong VAn HaI
// 1/6/2004
// Thai Binh
// CNTT2
// 2,50
// SV3
// Nguyen AnH MaNH
// 14/2/2004
// Thai Binh
// CNTT2
// 2,50
// GV4
// Nguyen AnH HaI
// 20/3/1974
// Ha Nam
// KT
// 20000000
// SV5
// pham AnH MaNH
// 8/5/2004
// Ha Nam
// CNTT1
// 2,70
// SV6
// pham Phuong MaNH
// 18/7/2004
// Ha Noi
// CNTT2
// 2,50
// GV7
// trAN Phuong LoNG
// 6/2/1979
// Ha Noi
// ATTT
// 20000000
// SV8
// Nguyen VAn HaI
// 25/8/2004
// Nam Dinh
// CNTT2
// 2,70
// SV9
// Luong Ngoc HaI
// 16/11/2004
// Ha Noi
// CNTT1
// 3,20