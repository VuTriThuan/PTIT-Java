import java.util.Arrays;
import java.util.Scanner;

public class maTranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n * n];
        for (int i = 0; i < n * n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        int[][] a = new int[n][n];
        int l = 0, r = n - 1, k = 0;
        while (l < r){
            for (int i = l; i < r; i++) {
                a[l][i] = arr[k];
                k++;
            }
            for (int i = l; i < r; i++){
                a[i][r] = arr[k];
                k++;
            }
            for (int i = r; i > l; i--){
                a[r][i] = arr[k];
                k++;
            }
            for (int i = r; i > l; i--){
                a[i][l] = arr[k];
                k++;
            }
            l++;
            r--;
        }
        if (l == r) a[l][l] = arr[k];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
