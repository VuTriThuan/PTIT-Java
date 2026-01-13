import java.util.Scanner;

public class chuanHoaHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String a = sc.nextLine();
            String[] s = a.trim().split("\\s+");
            for (String ss : s){
                ss = ss.substring(0, 1).toUpperCase() + ss.substring(1).toLowerCase();
                System.out.print(ss + " ");
            }
            System.out.println();
        }
    }
}
