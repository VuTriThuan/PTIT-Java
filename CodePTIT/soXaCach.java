import java.util.Scanner;

public class soXaCach {

    public static int n;
    public static int[] a = new int[10];
    public static int[] used = new int[10];

    public static void inkq(){
        for (int i = 1; i < n; i++) {
            if (Math.abs(a[i] - a[i + 1]) == 1) {
                return;
            }
        }
        for (int i = 1; i <= n; i++) System.out.print(a[i]);
        System.out.println();
    }

    public static void Try(int i){
        for (int j = 1; j <= n; j++){
            if (used[j] == 0){
                a[i] = j;
                used[j] = 1;
                if (i == n) inkq();
                else Try(i + 1);
                used[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            Try(1);
        }
    }
}
