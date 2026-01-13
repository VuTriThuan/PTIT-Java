import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    public String ten, ns;
    public int ngay, thang, nam;
    public Person(String s){
        String[] a = s.split("\\s+");
        ten = a[0];
        ns = "";
        for (int i = 1; i < a.length; i++) ns += a[i];
        ngay = Integer.valueOf(ns.substring(0, 2));
        thang = Integer.valueOf(ns.substring(3, 5));
        nam = Integer.valueOf(ns.substring(6, 10));
    }
    public String toString(){
        return this.ten;
    }
}

public class treNhatGiaNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> arr = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            arr.add(new Person(sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<Person>() {
            public int compare(Person a, Person b){
                if (a.nam == b.nam){
                    if (a.thang == b.thang) return a.ngay - b.ngay;
                    return a.thang - b.thang;
                }
                return a.nam - b.nam;
            }
        });
        System.out.println(arr.get(arr.size() - 1));
        System.out.println(arr.get(0));
    }
}
// 5
// Nam 01/10/1991
// An 30/12/1990
// Binh 15/08/1993
// Tam 18/09/1990
// Truong 20/09/1990
