import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class sapXepMaTran {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int[][] a = new int[n][m];
            int[] b = new int[n];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                    if (j == k - 1) b[i] = a[i][j];
                }
            }
            Arrays.sort(b);
            for (int i = 0; i < n; i++){
                a[i][k - 1] = b[i];
            }
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++) System.out.print(a[i][j] + " ");
                System.out.println();
            }
        }
    }
}
