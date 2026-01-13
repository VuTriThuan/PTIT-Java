import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class tapTuRiengCua2Xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String[] s1 = a.trim().split("\\s+");
            String[] s2 = b.trim().split("\\s+");
            HashSet<String> hs = new HashSet<>();
            TreeSet<String> ts = new TreeSet<>();
            for (String x : s2) hs.add(x);
            for (String x : s1){
                if (!hs.contains(x)) ts.add(x);
            }
            for (String x : ts) System.out.print(x.toLowerCase() + " ");
            System.out.println();
        }
    }
}
