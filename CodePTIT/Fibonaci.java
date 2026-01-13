//package CodePTIT;

import java.util.HashSet;
import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[100];
        HashSet<Long> se = new HashSet<>();
        arr[1] = 0;
        arr[2] = 1;
        se.add(arr[1]);
        se.add(arr[2]);
        for (int i = 3; i <= 92; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
            se.add(arr[i]);
        }
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            if (se.contains(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
