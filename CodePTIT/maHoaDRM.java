import java.util.Scanner;
public class maHoaDRM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine();
            String s1 = s.substring(0, s.length() / 2);
            String s2 = s.substring(s.length()/ 2, s.length());
            int t1 = 0, t2 = 0;
            for (int i = 0; i < s1.length(); i++){
                t1 += Integer.valueOf(s1.charAt(i) - 65);
                t2 += Integer.valueOf(s2.charAt(i) - 65);
            }
            String res1 = "";
            String res2 = "";
            for (int i = 0; i < s1.length(); i++){
                res1 += String.valueOf(Character.toChars((Integer.valueOf(s1.charAt(i) - 65) + t1) % 26 + 65));
                res2 += String.valueOf(Character.toChars((Integer.valueOf(s2.charAt(i) - 65) + t2) % 26 + 65));
            }
            String res = "";
            for (int i = 0; i < s2.length(); i++){
                int x = Integer.valueOf(res2.charAt(i) - 65) + Integer.valueOf(res1.charAt(i));
                if (x > 90) x = x % 91 + 65;
                res += String.valueOf(Character.toChars(x));
            }
            System.out.println(res);
        }
    }
}
