
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


public class NewClass1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            ArrayList<String> arr = new ArrayList<>();
            String[] s1 = sc.nextLine().trim().split("\\s+");
            String[] s2 = sc.nextLine().trim().split("\\s+");
            HashSet<String> se1 = new HashSet<>();
            for (String x : s1){
                se1.add(x);
            }
            HashSet<String> se2 = new HashSet<>();
            for (String x : s2){
                se2.add(x);
            }
            for (String x : se1){
                if (!se2.contains(x)) arr.add(x);
            }
            Collections.sort(arr);
            for (String x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
//2
//abc ab ab ab abcd
//ab abc
//aaa xyz ab zzz abc dd dd abc
//xyz dd ttt sas cdc