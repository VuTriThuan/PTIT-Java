import java.util.Scanner;

public class xauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            sc.nextLine();
            String s = sc.nextLine();
            int k = sc.nextInt();
            int[] a = new int[127];
            int thua = 0, thieu = 0;
            for (int i = 0; i < s.length(); i++){
                if (a[Integer.valueOf(s.charAt(i))] == 1){
                    thua++;
                }
                else{
                    a[Integer.valueOf(s.charAt(i))] = 1;
                }
            }
            for (int i = 97; i <= 122; i++){
                if (a[i] == 0) thieu++;
            }
            if (thieu > k || thieu > thua || thua < k) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}

