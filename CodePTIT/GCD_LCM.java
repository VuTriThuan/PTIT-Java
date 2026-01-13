import java.util.Scanner;

public class GCD_LCM {
    public static long gcd(long a, long b){
        while (b != 0){
            long x = a % b;
            a = b;
            b = x;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long uc = gcd(a, b);
            long bc = a * b / uc;
            System.out.println(bc + " " + uc);
        }
    }
}
