import java.util.Scanner;

public class quayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            int minn = 0;
            for (int i = 0; i < n; i++){
                a[i] = sc.nextLong();
                if (a[minn] > a[i]) minn = i;
            }
            System.out.println(minn);
        }
    }
}
