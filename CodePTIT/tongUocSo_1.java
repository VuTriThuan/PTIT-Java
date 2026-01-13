import java.util.Scanner;

public class tongUocSo_1 {

    public static int[] prime = new int[2000005];

    //tim uoc nho nhat cua cac so
    public static void uocMin(){
        for (int i = 2; i * i <= 2000000; i++){
            if (prime[i] == 0){
                for (int j = i; j <= 2000000; j += i){
                    if(prime[j] == 0) prime[j] = i;
                }
            }
        }
        for (int i = 1; i <= 2000000; i++){
            if (prime[i] == 0) prime[i] = i;
        }
    }

    public static long tongUocSo(int n){
        if (prime[n] == n) return n;
        long tong = 0;
        while (prime[n] != 1){
            tong += prime[n];
            n /= prime[n];
        }
        return tong;
    }
    public static void main (String[] args) {
        uocMin();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long tong = 0;
        for (int i = 0; i < t; i++){
            int x = sc.nextInt();
            tong += tongUocSo(x);
        }
        System.out.println(tong);
    }
}
