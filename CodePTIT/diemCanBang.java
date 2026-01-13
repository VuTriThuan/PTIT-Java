import java.util.Scanner;

public class diemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int r = 0;
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if (i > 1) r += a[i];
            }
            int l = a[0];
            int check = 0;
            for (int i = 1; i < n - 1; i++){
                if (l == r){
                    check = 1;
                    System.out.println(i + 1);
                    break;
                }
                l += a[i];
                r -= a[i + 1];
            }
            if (check == 0) System.out.println(-1);
        }
    }
}
