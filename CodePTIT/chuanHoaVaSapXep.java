import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    public String hoTen, ten, ho, dem;
    public Person(String hoTen){
        String[] a = hoTen.trim().split("\\s+");
        String res = "";
        for (String x : a){
            res += x.substring(0, 1).toUpperCase() + x.substring(1, x.length()).toLowerCase() + " ";
        }
        this.hoTen = res.substring(0, res.length() - 1);
        ten = a[a.length - 1];
        ho = a[0];
        dem = "";
        for (int i = 1; i < a.length - 1; i++) dem += a[i];
    }
    public String toString(){
        return this.hoTen;
    }
}

public class chuanHoaVaSapXep {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Person> arr = new ArrayList<>();
        while (sc.hasNext()){
            arr.add(new Person(sc.nextLine().toLowerCase()));
        }
        Collections.sort(arr, new Comparator<Person>() {
            public int compare(Person a, Person b){
                if (a.ten.equals(b.ten)){
                    if (a.ho.equals(b.ho)) return a.dem.compareTo(b.dem);
                    return a.ho.compareTo(b.ho);
                }
                return a.ten.compareTo(b.ten);
            }
        });
        for (Person x : arr) System.out.println(x);
    }
}
