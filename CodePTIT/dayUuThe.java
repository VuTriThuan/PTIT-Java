import java.util.Scanner;

public class dayUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] s = sc.nextLine().trim().split("\\s+");
            int chan = 0, le = 0;
            for (String x : s){
                char c = x.charAt(x.length() - 1);
                if ((int)c % 2 == 0) chan++;
                else le++;
            }
            if ((chan > le && s.length % 2 == 0) || (chan < le && s.length % 2 != 0)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
