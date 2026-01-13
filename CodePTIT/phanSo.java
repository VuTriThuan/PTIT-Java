import java.util.Scanner;

public class phanSo {

    public static long gcd(long a, long b){
        if (b == 0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long a1 = sc.nextLong(), b1 = sc.nextLong();
        long a2 = a * b1 + b * a1, b2 = b * b1;
        long u = gcd(a2, b2);
        a2 /= u; b2 /= u;
        System.out.println(a2 + "/" + b2);
    }
}
