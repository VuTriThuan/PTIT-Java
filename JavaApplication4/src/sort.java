
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            arr.add(x);
        }
        Collections.sort(arr);
        for (int i = 0; i < n; i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        Collections.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < n; i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}
