import java.util.Scanner;

public class BanVeDieHard {
    public static boolean solve (int[] a, int n){
        int mn25 = 0, mn50 = 0, mn100 = 0;
        for (int i = 0; i < n; i++){
            if (a[i] == 25){
                mn25++;
            }
            else if (a[i] == 50){
                mn50++;
                if (mn25 == 0) return false;
            }
            else{
                mn100++;
                if (mn25 >= 3 || (mn25 >= 1 && mn50 >= 1)) continue;
                else return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        if (solve(a, n)) System.out.println("True");
        else System.out.println("False");
    }
}
