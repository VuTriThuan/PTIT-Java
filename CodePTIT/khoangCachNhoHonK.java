import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class khoangCachNhoHonK {

    public static int n;
    public static long k;
    public static ArrayList<Long> a = new ArrayList<>();
    public static long cnt;

    public static long khoangCach(int start){
        int l = start, r = n - 1;
        long x = 0;
        while (l <= r){
            int m = l + (r - l) / 2;
            if ((a.get(start) - a.get(m)) < k){
                x = m;
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            k = sc.nextInt();
            for (int i = 0; i < n; i++){
                a.add(sc.nextLong());
            }
            Collections.sort(a, Collections.reverseOrder());
            cnt = 0;
            for (int i = 0; i < n; i++){
                if (khoangCach(i) != 0) cnt +=  khoangCach(i) - i;
            }
            System.out.println(cnt);
            a.clear();
        }
    }
}
