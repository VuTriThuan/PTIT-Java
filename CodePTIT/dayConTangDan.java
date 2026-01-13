import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dayConTangDan {

    public static int n;
    public static int[] a = new int[50];
    public static ArrayList<String> arr = new ArrayList<>();

    public static void Try(String s, int i){
        String[] ss = s.trim().split("\\s+");
        if (ss.length > 1) arr.add(s);
        for (int j = i + 1; j < n; j++){
            if (a[i] < a[j]){
                Try(s + " " + Integer.toString(a[j]), j);
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++){
            Try(Integer.toString(a[i]), i);
        }
        Collections.sort(arr);
        for (String x : arr) System.out.println(x);
    }
}
