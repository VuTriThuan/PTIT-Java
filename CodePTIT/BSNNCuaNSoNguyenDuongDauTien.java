import java.util.Scanner;

public class BSNNCuaNSoNguyenDuongDauTien {

    public static long[] prime = new long[105];

    public static void nguyenTo(){
        for (int i = 1; i <= 100; i++) prime[i] = 1;
        prime[1] = 0;
        for (int i = 2; i <= 10; i++){
            if (prime[i] == 1){
                for (int j = i * i; j <= 100; j += i) prime[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nguyenTo();
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            long res = 1;
            for (int i = 1; i <= n; i++){
                if (prime[i] == 1){
                    long m = i;
                    while (m <= n){
                        m *= i;
                    }
                    m /= i;
                    res *= m;
                }
            }
            System.out.println(res);
        }
    }
}
