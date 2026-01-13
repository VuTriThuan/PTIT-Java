import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bo3SoPitago {
    public static ArrayList<Long> a = new ArrayList<>();
    public static String check(){
        for (int i = a.size() - 1; i >= 2; i--){
            int l = 0, r = i - 1;
            while (l < r){
                if ((a.get(l) + a.get(r)) == a.get(i)) return "YES";
                if ((a.get(l) + a.get(r)) > a.get(i)) r--;
                else l++;
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            for (int i = 0; i < n; i++){
                long x = sc.nextLong();
                a.add(x * x);
            }
            Collections.sort(a);
            System.out.println(check());
            a.clear();
        }
    }
}
