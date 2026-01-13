
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    public String hoTen, vietTat, ten, ho;
    public Person(String hoTen){
        this.hoTen = hoTen;
        
        String[] a = hoTen.trim().split("\\s+");
        this.vietTat = "";
        for (String x : a) this.vietTat += x.substring(0,1).toUpperCase() + ".";
        this.vietTat = this.vietTat.substring(0, this.vietTat.length() - 1);
        
        this.ho = a[0];
        
        this.ten = a[a.length - 1];
    }
    public String toString(){
        return this.hoTen;
    }
}


public class TenVietTat {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Person> arr = new ArrayList<>();
        while (t-- > 0){
            String ten = sc.nextLine();
            arr.add(new Person(ten));
        }
        Collections.sort(arr, new Comparator<Person>(){
            public int compare(Person a, Person b){
                if (a.ten.equals(b.ten)) return a.ho.compareTo(b.ho);
                return a.ten.compareTo(b.ten);
            }
        });
        
        int k = sc.nextInt();
        sc.nextLine();
        while (k-- > 0){
            String s = sc.nextLine();
            for (Person x : arr){
                if (x.vietTat.length() != s.length()) continue;
                boolean check = true;
                for (int i = 0; i < s.length(); i++){
                    if (s.charAt(i) != '*' && s.charAt(i) != x.vietTat.charAt(i)){
                        check = false;
                        break;
                    }
                }
                if (check == true) System.out.println(x);
            }
        }
    }
}
