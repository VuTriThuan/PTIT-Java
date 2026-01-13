import java.util.Scanner;

public class bienSoDep {

    public static boolean tangChat(String s){
        for (int i = 1; i < s.length(); i++){
            if ((s.charAt(i) - '0') != (s.charAt(i - 1) - '0') + 1) return false;
        }
        return true;
    }

    public static boolean giongNhau(String s){
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) != s.charAt(i - 1)) return false;
        }
        return true;
    }

    public static boolean dauCuoi(String s){
        if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4)) return true;
        return false;
    }

    public static boolean locPhat(String s){
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
    }

    public static String check(String s){
        if (locPhat(s) || giongNhau(s) || dauCuoi(s) || tangChat(s)) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            String res = "";
            res += s.charAt(5);
            res += s.charAt(6);
            res += s.charAt(7);
            res += s.charAt(9);
            res += s.charAt(10);
            System.out.println(check(res));
        }
    }
}
// 7
// 29T1–123.45
// 29T1–555.55
// 29T1–222.33
// 29T1–686.88
// 29T1–123.33
// 29T1–555.54
// 29T1–606.88