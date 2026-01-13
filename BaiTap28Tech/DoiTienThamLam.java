import java.util.Scanner;

public class DoiTienThamLam{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0, k = 9;
        int[] a = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        while (n != 0){
            cnt += n / a[k];
            n = n % a[k];
            k--;
        }
        System.out.println(cnt);
    }
}
