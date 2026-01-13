import java.util.Scanner;

public class boSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[205];
        int k = 0;
        for (int i = 1; i <= n; i++){
            int x = sc.nextInt();
            k = x;
            a[x] = 1;
        }
        if (k == n){
            System.out.println("Excellent!");
            return;
        }
        for (int i = 1; i < k; i++){
            if (a[i] == 0) System.out.println(i);
        }
    }
}
