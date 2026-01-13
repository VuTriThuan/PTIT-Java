import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class so0vaSo9 {

    public static ArrayList<Integer> arr = new ArrayList<>();

    public static void Try(String s, int i, int n){
        if (Integer.valueOf(s) % n == 0){
            arr.add(Integer.valueOf(s));
            return;
        }
        if (i > 8) return;
        Try(s + "0", i + 1, n);
        Try(s + "9", i + 1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            Try("9", 1, n);
            Collections.sort(arr);
            System.out.println(arr.get(0));
            arr.clear();
        }
    }
}
