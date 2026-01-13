import java.util.Arrays;
import java.util.Scanner;

public class dayConCoKPhanTuTangDan {

    public static int n, k;
    public static int[] a = new int[20];
    public static int[] arr = new int[20];

    public static void inkq(){
        for (int i = 0; i < k; i++) System.out.print(arr[a[i]] + " ");
        System.out.println();
    }

    public static void Try(int i, int start){
        if (i == k){
            inkq();
            return;
        }
        for (int j = start; j < n; j++){
            a[i] = j;
            Try(i + 1, j + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            k = sc.nextInt();
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr, 0, n);
            Try(0, 0);
        }
    }
}
