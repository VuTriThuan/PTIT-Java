import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class giao2DaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            hs.add(x);
        }
        for (int i = 0; i < m; i++){
            int x = sc.nextInt();
            ts.add(x);
        }
        for (int x : ts){
            if (hs.contains(x)) System.out.print(x + " ");
        }
    }
}
