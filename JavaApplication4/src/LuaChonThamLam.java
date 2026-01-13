
import java.util.Scanner;

public class LuaChonThamLam {
    public static String maxx(int n, int s){
        if (s > n*9 || s < 1) return "-1";
        String m = "";
        while (s > 9){
            m += "9";
            s -= 9;
        }
        m += Integer.toString(s);
        while (m.length() < n) m += "0";
        return m;
    }
    public static String minn (int n, int s){
        if (s > n*9 || s < 1) return "-1";
        String m = "";
        while (s > 9){
            m += "9";
            s -= 9;
        }
        if (n - m.length() > 1){
            m += Integer.toString(s - 1);
            while (m.length() < n - 1) m += "0";
            m += Integer.toString(1);
        }
        else{
            m += Integer.toString(s);
        }
        return new StringBuilder(m).reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        System.out.println(minn(n, s) + " " + maxx(n, s));
    }
}
