import java.math.BigInteger;
import java.util.Scanner;

public class hieuSoNguyenLon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger c = a.subtract(b).abs();

            int maxx = Math.max(a.toString().length(), b.toString().length());
            StringBuilder sb = new StringBuilder(c.toString());
            while (sb.length() < maxx){
                sb.insert(0, '0');
            }
            System.out.println(sb);
        }
    }
}