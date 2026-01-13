import java.util.Scanner;

public class chuSo4VaChuSo7 {

    public static String check(String s){
        int cnt = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '4' || s.charAt(i) == '7') cnt += 1;
        }
        if (cnt == 4 || cnt == 7) return "YES";
        else return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check(s));
    }
}
