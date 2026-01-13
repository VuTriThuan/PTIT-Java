import java.util.Scanner;

public class dayConLienTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            int l = 0, r = 0;
            long tong = a[l];
            boolean check = false;
            while (l < n){
                if (tong == k) {
                    check = true;
                    break;
                }
                if (l == r || tong < k){
                    r++;
                    if (r >= n) break;
                    tong += a[r];
                }
                else if (tong > k){
                    tong -= a[l];
                    l++;
                }
            }
            if (check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
