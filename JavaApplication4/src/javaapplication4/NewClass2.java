
package javaapplication4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NewClass2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; j++){
            LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++){
                int x = sc.nextInt();
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
            System.out.println("Test " + j + ":");
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
        }
    }
}
