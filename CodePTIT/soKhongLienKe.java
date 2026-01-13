import java.util.Scanner;

public class soKhongLienKe {

    public static int tong(String s){
        int res = 0;
        for (int i = 0; i < s.length(); i++){
            res += s.charAt(i) - '0';
        }
        return res;
    }

    public static String check(String s){
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) != s.charAt(i - 1) - 2 && s.charAt(i) != s.charAt(i - 1) + 2){
                return "NO";
            }
        }
        if (tong(s) % 10 == 0) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }
}
