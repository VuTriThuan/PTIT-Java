import java.util.Scanner;

public class catDoi {

    public static String catdoi(String n){
        String res = "";
        for (int i = 0; i < n.length(); i++){
            if (n.charAt(i) == '1') res = res + "1";
            else if (n.charAt(i) == '0' || n.charAt(i) == '8' || n.charAt(i) == '9') res = res + "0";
            else return "INVALID";
        }
        String s = "";
        int check = 0;
        for (int i = 0; i < res.length(); i++){
            if (res.charAt(i) != '0'){
                check = 1;
                s = s + res.charAt(i);
            }
            if (res.charAt(i) == '0' && check == 1) s = s + res.charAt(i);
        }
        if (s.length() < 1) return "INVALID";
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String n = sc.nextLine();
            System.out.println(catdoi(n));
        }
    }
}
