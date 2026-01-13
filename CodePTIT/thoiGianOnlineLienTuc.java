import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    public String ten;
    public long t;
    public Person(String ten, String start, String end){
        this.ten = ten;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try{
            t = sdf.parse(end).getTime() - sdf.parse(start).getTime();
        }catch(ParseException ex){

        }
    }
    public String toString(){
        return this.ten + " " + this.t / 60000;
    }
}

public class thoiGianOnlineLienTuc {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Person> arr = new ArrayList<>();
        while (t-- > 0){
            arr.add(new Person(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<Person>() {
            public int compare(Person a, Person b){
                if (a.t == b.t) return a.ten.compareTo(b.ten);
                return Long.compare(b.t, a.t);
            }
        });
        for (Person x : arr) System.out.println(x);
    }
}
