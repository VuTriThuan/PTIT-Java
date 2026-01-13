import java.util.Scanner;
public class hinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n - 1; i++){
            int u = sc.nextInt(), v = sc.nextInt();
            arr[u]++; 
            arr[v]++;
        }
        int cnt = 0;
        for (int x : arr){
            if (x > 1) cnt++;
        }
        if (cnt == 1) System.out.println("Yes");
        else System.out.println("No");
    }
}
