package javaapplication4;

import java.util.HashSet;
import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Long> se = new HashSet<>();
        int t = sc.nextInt();
        long[] arr = new long[100];
        arr[1] = 0; arr[2] = 1;
        se.add((long)0); se.add((long)1);
        for (int i = 3; i <= 92; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
            se.add(arr[i]);
        }
        for (int test = 0; test < t; test++){
            long n = sc.nextLong();
            if (se.contains(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
