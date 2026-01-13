
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NewClass {
    public static boolean check(ArrayList<Long> arr){
        for (int i = arr.size() - 1; i >= 2; i--){
            int l = 0, r = i - 1;
            while (l < r){
                if ((arr.get(l) + arr.get(r)) == arr.get(i)) return true;
                if ((arr.get(l) + arr.get(r)) > arr.get(i)) r--;
                else l++;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            ArrayList<Long> arr = new ArrayList<>();
            for (int i = 0; i < n; i++){
                long x = sc.nextLong();
                arr.add(x * x);
            }
            Collections.sort(arr);
            if (check(arr)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
