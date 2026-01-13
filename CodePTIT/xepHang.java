import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    public int start, kc;
    public Person(int start, int kc){
        this.start = start;
        this.kc = kc;
    }
}

public class xepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> p = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int s = sc.nextInt();
            int kc = sc.nextInt();
            Person pe = new Person(s, kc);
            p.add(pe);
        }
        Collections.sort(p, new Comparator<Person>() {
            public int compare(Person p1, Person p2){
                if (p1.start == p2.start) return p1.kc - p2.kc;
                return p1.start - p2.start;
            }
        });
        int cnt = p.get(0).start;
        for (int i = 0; i < n; i++){
            cnt += p.get(i).kc;
            if (i < n - 1){
                if (cnt < p.get(i + 1).start) cnt = p.get(i + 1).start;
            }
        }
        System.out.println(cnt);
    }
}
