//package CodePTIT;

import java.util.Scanner;

public class thuaSoNguyenTo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x = 1; x <= t; x++){
            int n = sc.nextInt();
            int N = n;
            System.out.printf("Test %d: ", x);
            for (int i = 2; i <= Math.sqrt(N); i++){
                int cnt = 0;
                while (n % i == 0){
                    cnt++;
                    n /= i;
                }
                if (cnt != 0) System.out.print(i + "(" + cnt + ") ");
            }
            if (n != 1) System.out.print(n + "(" + 1 + ") ");
            System.out.println();
        }
    }
}