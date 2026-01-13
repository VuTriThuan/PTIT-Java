
import java.util.Scanner;

public class ChuanHoaHoTen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        for (int i = 0; i < n; i++){
            s[i] = sc.nextLine();
            String[] arr = s[i].trim().split("\\s+");
            s[i] = "";
            for (String x : arr){
                s[i] += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
            }
        }
        for (int i = 0; i < n; i++) System.out.println(s[i]);
    }
}
