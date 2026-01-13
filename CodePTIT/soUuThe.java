import java.util.Scanner;

public class soUuThe {

    public static String check(String s){
        int chan = 0, le = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) > '9' || s.charAt(i) < '0') return "INVALID";
            if (s.charAt(i) == '0' || s.charAt(i) == '2' || s.charAt(i) == '4' || s.charAt(i) == '6' || s.charAt(i) == '8') chan += 1;
            else le += 1;
        }
        if (s.length() % 2 == 0 && chan > le) return "YES";
        else if (s.length() % 2 != 0 && chan < le) return "YES";
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
