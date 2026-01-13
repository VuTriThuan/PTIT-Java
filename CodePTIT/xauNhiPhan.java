import java.util.Scanner;

public class xauNhiPhan {

    public static long[] fibo = new long[100];

    public static void ktao(){
        fibo[1] = 1;
        fibo[2] = 1;
        for (int i = 3; i <= 93; i++) fibo[i] = fibo[i - 1] + fibo[i - 2];
    }

    public static int check(int n, long k){
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (k > fibo[n - 2]) return check(n - 1, k - fibo[n - 2]);
        else return check(n - 2, k);
    }

    public static void main(String[] args) {
        ktao();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(check(n, k));
        }
    }
}
