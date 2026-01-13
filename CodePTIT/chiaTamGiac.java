//package CodePTIT;

import java.util.Scanner;

public class chiaTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            int n = sc.nextInt();
            double h = sc.nextDouble();
            double s = h / 2;
            for (int i = 1; i < n; i++){
                double x = Math.sqrt(2 * h * s * i / n);
                System.out.print(String.format("%.6f" ,x) + " ");
            }
            System.out.println();
            t -= 1;
        }
    }
}
