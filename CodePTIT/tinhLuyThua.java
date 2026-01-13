import java.util.Scanner;

public class tinhLuyThua {

    public static final long mod = 1000000007;

    public static long luyThua(long a, long b){
        if (b == 0) return 1;
        if (b == 1) return a % mod;
        long tmp = luyThua(a, b / 2);
        if (b % 2 == 0) return (tmp * tmp) % mod;
        else return (((tmp * tmp) % mod) * a) % mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) break;
            System.out.println(luyThua(a, b));
        }
    }
}
