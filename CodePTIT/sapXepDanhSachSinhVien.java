import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    public String ma, sdt, email, hoTen, ten, ho, dem;
    public Person(String ma, String hoTen, String sdt, String email){
        this.ma = ma;

        this.hoTen = hoTen;
        String[] a = hoTen.trim().split("\\s+");
        ten = a[a.length - 1];
        ho = a[0];
        dem = "";
        for (int i = 1; i < a.length - 1; i++) dem += a[i];

        this.sdt = sdt;
        this.email = email;
    }
    public String toString(){
        return this.ma + " " + this.hoTen + " " + this.sdt + " " + this.email;
    }
}

public class sapXepDanhSachSinhVien {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Person> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            arr.add(new Person(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<Person>() {
            public int compare(Person a, Person b){
                if (a.ten.equals(b.ten)){
                    if (a.ho.equals(b.ho)){
                        if (a.dem.equals(b.dem)) return a.ma.compareTo(b.ma);
                        return a.dem.compareTo(b.dem);
                    }
                    return a.ho.compareTo(b.ho);
                }
                return a.ten.compareTo(b.ten);
            }
        });
        for (Person x : arr) System.out.println(x);
    }
}
