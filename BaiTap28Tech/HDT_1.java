//Student ke thua Person
//chuan hoa ten, ngay sinh
//sap xep theo ten, ho, dem


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    private String ten, ns, diaChi;
    public Person(){
        ten = ns = diaChi = "";
    }
    public Person (String ten, String ns, String diaChi){
        this.ten = ten;
        this.ns = ns;
        this.diaChi = diaChi;
    }
    public void chuanHoa(){
        //chuan hoa ten
        String[] arr = this.ten.split("\\s+");
        String res = "";
        for (String x : arr){
            res += Character.toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++){
                res += Character.toLowerCase(x.charAt(i));
            }
            res += " ";
        }
        this.ten = res;
        //chuan hoa ngay sinh
        StringBuilder sb = new StringBuilder(this.ns);
        if (sb.charAt(1) == '/') sb.insert(0,"0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        this.ns = sb.toString();
    }
    //Nguyen Van Nam = NamNguyenVan
    public String getSortedName(){
        String[] arr = this.ten.split("\\s+");
        String res = arr[arr.length - 1];
        res += arr[0];
        for (int i = 1; i < arr.length - 1; i++){
            res += arr[i];
        }
        return res;
    }
    public String toString(){
        return this.ten + " " + this.ns + " " + this.diaChi;
    }
}

class Student extends Person{
    private String lop, msv;
    private double gpa;
    public Student(int msv, String lop, double gpa, String ten, String ns, String diaChi){
        super(ten, ns, diaChi);
        this.lop = lop;
        this.gpa = gpa;
        this.msv = String.format("%04d", msv);
    }
    public String toString(){
        return this.msv + " " + super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }
}

public class HDT_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<Student>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            String diaChi = sc.nextLine();
            String lop = sc.nextLine();
            double gpa = sc.nextDouble();
            Student SinhVien = new Student(i, lop, gpa, ten, ns, diaChi);
            SinhVien.chuanHoa();
            arr.add(SinhVien);
        }
        Collections.sort(arr, new Comparator<Student>(){
            public int compare(Student o1, Student o2){
                return o1.getSortedName().compareTo(o2.getSortedName());
            }
        });
        for (Student x : arr){
            System.out.println(x);
        }
    }
}

// 6
// trAN Phuong HaI
// 17/4/2004
// Ha Noi
// DTVT1
// 2,50
// trAN Phuong TuaN
// 28/1/2004
// Ha Nam
// DTVT1
// 2,50
// Nguyen AnH MaNH
// 11/3/2004
// Ha Noi
// CNTT1
// 2,70
// pham duC TuaN
// 21/5/2004
// Ha Noi
// DTVT1
// 2,50
// trAN VAn LoNG
// 24/6/2004
// Ha Noi
// CNTT1
// 2,80
// Luong Ngoc LoNG
// 12/11/2004
// Nam Dinh
// CNTT2
// 3,05
