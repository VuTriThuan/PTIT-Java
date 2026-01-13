import java.util.Scanner;

public class xauDoiXung {

    public static String check(String s){
        int cnt = 0;
        for (int i = 0; i < (int) (s.length() / 2); i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) cnt += 1;
            if (cnt > 1) return "NO";
        }
        if (s.length() % 2 == 0 && cnt == 1) return "YES";
        if (s.length() % 2 != 0 && cnt <= 1) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}
