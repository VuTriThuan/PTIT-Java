import java.util.ArrayList;
import java.util.Scanner;

public class soLocPhat {

    public static ArrayList<String> arr = new ArrayList<>();

    public static void Try(String s, int k){
        if (s.length() == k){
            arr.add(s);
            return;
        }
        Try(s + "8", k);
        Try(s + "6", k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            for (int i = n; i >= 1; i--){
                Try("", i);
            }
            System.out.println(arr.size());
            for (String s : arr) System.out.print(s + " ");
            System.out.println();
            arr.clear();
        }
    }
}
