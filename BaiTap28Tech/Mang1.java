import java.util.Scanner;

public class Mang1 {
    public static boolean nguyenTo(int n){
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int maxKey = Integer.MIN_VALUE, maxValue = Integer.MIN_VALUE;
        int minKey = Integer.MAX_VALUE, minValue = Integer.MAX_VALUE;
        int cnt = 0;
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if (a[i] > maxValue){
                maxValue = a[i];
                maxKey = i;
            }
            if (a[i] <= minValue){
                minValue = a[i];
                minKey = i;
            }
            if (nguyenTo(a[i])) cnt++;
        }
        System.out.println(maxValue + " " + maxKey);
        System.out.println(minValue + " " + minKey);
        System.out.println(cnt);

    }
}
