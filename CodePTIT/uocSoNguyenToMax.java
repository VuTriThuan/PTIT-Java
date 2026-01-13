import java.util.Scanner;

public class uocSoNguyenToMax {

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        uocMin();
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            int res = (int) Math.sqrt(n);
            if (res == prime[res] && res * res == n) System.out.println(res);
            else{
                int u = Integer.MIN_VALUE;
                int check = 0;
                for (int i = 2; i <= res; i++){
                    while (n % i == 0){
                        u = Math.max(u, i);
                        n /= i;
                        check = 1;
                    }
                }
                if (check == 0) System.out.println(n);
                else{
                    if (n > u) System.out.println(n);
                    else System.out.println(u);
                }
            }
        }
    }
}
