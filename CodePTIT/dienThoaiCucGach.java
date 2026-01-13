import java.util.Scanner;

public class dienThoaiCucGach {

    public static String check(String s){
        for (int i = 0; i < (int) (s.length() / 2); i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            String res = "";
            for (int i = 0; i < s.length(); i++){
                char c = Character.toLowerCase(s.charAt(i));
                if (c >= 'a' && c <= 'c') res += "2";
                if (c >= 'd' && c <= 'f') res += "3";
                if (c >= 'g' && c <= 'i') res += "4";
                if (c >= 'j' && c <= 'l') res += "5";
                if (c >= 'm' && c <= 'o') res += "6";
                if (c >= 'p' && c <= 's') res += "7";
                if (c >= 't' && c <= 'v') res += "8";
                if (c >= 'w' && c <= 'z') res += "9";
            }
            System.out.println(check(res));
        }
    }
}
