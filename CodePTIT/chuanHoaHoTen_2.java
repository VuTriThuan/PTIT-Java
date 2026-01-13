import java.util.Scanner;

public class chuanHoaHoTen_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String a = sc.nextLine();
            String[] s = a.trim().split("\\s+");
            for (int i = 0; i < s.length; i++){
                if (i == 0) s[i] = s[i].toUpperCase();
                else s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1).toLowerCase();
            }
            for (int i = 1; i < s.length; i++){
                System.out.print(s[i]);
                if (i != s.length - 1) System.out.print(" ");
                else System.out.print(", ");
            }
            System.out.println(s[0]);
        }
    }
}
