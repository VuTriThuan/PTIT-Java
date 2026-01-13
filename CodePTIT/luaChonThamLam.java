import java.util.Scanner;

public class luaChonThamLam {

    public static String maxx(int n, int s){
        String res = "";
        if (s == 0 && n > 1) return "-1";
        while (n > 0 && s != 0){
            if (s > 9){
                res += "9";
                s -= 9;
            }
            else{
                res += Integer.toString(s);
                s = 0;
            }
            n--;
        }
        if (n == 0 && s != 0) return "-1";
        if (n > 0) {
            for (int i = 0; i < n; i++) res += "0";
        }
        return res;
    }

    public static String minn(int n, int s){
        String res = "";
        if (s == 0 && n > 1) return "-1";
        if (s == 0 && n == 1) return "0";
        while (n > 0 && s != 0){
            if (s > 9){
                res += "9";
                s -= 9;
            }
            else{
                if (n == 1){
                    res += Integer.toString(s);
                    s = 0;
                }
                else {
                    res += Integer.toString(s - 1);
                    n--;
                    while (n > 1){
                        res += "0";
                        n--;
                    }
                    res += "1";
                    s = 0;
                }
            }
            n--;
        }
        if (n == 0 && s != 0) return "-1";
        String x = "";
        for (int i = res.length() - 1; i >= 0; i--){
            x += res.charAt(i);
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(minn(n, s) + " " +  maxx(n, s));
    }
}
