import java.util.Scanner;

public class soLienKe {

    public static String check(String s){
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) != s.charAt(i - 1) - 1 && s.charAt(i) != s.charAt(i - 1) + 1){
                return "NO";
            }
        }
        return "YES";
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
