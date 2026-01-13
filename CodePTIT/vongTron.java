import java.util.Scanner;

public class vongTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] a = new int[26];
        int cnt = 0; //dem so giao diem
        for (int i = 0; i < s.length(); i++){
            if (a[Integer.valueOf(s.charAt(i)) - 65] == 0){
                a[Integer.valueOf(s.charAt(i)) - 65] = 1;
                int[] check = new int[26]; 
                check[Integer.valueOf(s.charAt(i)) - 65] = 2;
                for (int j = i + 1; j < s.length(); j++){
                    if (s.charAt(i) == s.charAt(j)) break;
                    check[Integer.valueOf(s.charAt(j)) - 65]++;
                }
                for (int j = 0; j < 26; j++){
                    if (check[j] == 1) cnt++;
                }
            }
        }
        System.out.println(cnt / 2);
    }
}
