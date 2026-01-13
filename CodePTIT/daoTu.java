import java.util.Scanner;

public class daoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String a = sc.nextLine();
            String[] s = a.trim().split("\\s+");
            for (String x : s){
                for (int i = x.length() - 1; i >= 0; i--){
                    System.out.print(x.charAt(i));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
