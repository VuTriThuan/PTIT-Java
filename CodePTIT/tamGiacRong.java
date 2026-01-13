import java.util.Scanner;

public class tamGiacRong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 2 * n - 1;
        Character[][] a = new Character[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) a[i][j] = ' ';
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                a[i][(int)(m / 2) - i] = '*';
                a[i][(int)(m / 2) + i] = '*';
                if (i == n - 1) a[i][j] = '*';
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) System.out.print(a[i][j]);
            System.out.println();
        }
    }
}
