
import java.math.BigInteger;
import java.util.Scanner;


public class HieuSoNguyenLon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            BigInteger c = a.subtract(b).abs();
            
            int maxx = Math.max(a.toString().length(), b.toString().length());
            String res = c.toString();
            StringBuilder sb = new StringBuilder(res);
            while (sb.length() < maxx) sb.insert(0, '0');
            System.out.println(sb);
        }
    }
}
