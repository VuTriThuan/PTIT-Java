import java.util.ArrayList;
import java.util.Scanner;

public class toanLop3 {
    public static int[] a = new int[10];
    public static ArrayList<String> arr = new ArrayList<>();
    public static Character[] dau = new Character[4];
    public static int k;
    public static void inkq(){
        String res = "";
        for (int i = 0; i < k; i++){
            res += (char)(a[i] + '0');
        }
        arr.add(res);
    }
    public static void Try(int i){
        for (int j = 0; j <= 9; j++){
            a[i] = j;
            if (i == (k - 1)) inkq();
            else Try(i + 1);
        }
    }

    public static boolean check(String s){
        if (s.charAt(0) == '0' || s.charAt(5) == '0' || s.charAt(10) == '0') return false;
        int a = Integer.parseInt(s.substring(0, 2));
        int b = Integer.parseInt(s.substring(5, 7));
        int c = Integer.parseInt(s.substring(10, 12));
        if (s.charAt(3) == '+'){
            if ((a + b) == c) return true;
        }
        if (s.charAt(3) == '-'){
            if ((a - b) == c) return true;
        }
        if (s.charAt(3) == '*'){
            if ((a * b) == c) return true;
        }
        if (s.charAt(3) == '/'){
            if (a % b != 0) return false;
            if ((a / b) == c) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            boolean tmp = false;
            String s = sc.nextLine();
            ArrayList<Integer> cnt = new ArrayList<>();
            dau[0] = '+';
            dau[1] = '-';
            dau[2] = '*';
            dau[3] = '/';
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == '?' && i != 3) cnt.add(i);
            }
            if (cnt.size() == 0){
                if (check(s) == true) System.out.println(s);
                else System.out.println("WRONG PROBLEM!");
                continue;
            }
            arr.clear();
            k = cnt.size();
            Try(0);
            if (s.charAt(3) == '?'){
                for (int d = 0; d < 4; d++){
                    StringBuilder sb = new StringBuilder(s);
                    sb.setCharAt(3, dau[d]);
                    for (int i = 0; i < arr.size(); i++){
                        for (int j = 0; j < cnt.size(); j++){
                            sb.setCharAt(cnt.get(j), arr.get(i).charAt(j));
                        }
                        if (check(sb.toString())){
                            System.out.println(sb.toString());
                            tmp = true;
                        }
                    }
                }
            }
            else{
                StringBuilder sb = new StringBuilder(s);
                for (int i = 0; i < arr.size(); i++){
                    for (int j = 0; j < cnt.size(); j++){
                        sb.setCharAt(cnt.get(j), arr.get(i).charAt(j));
                    }
                    if (check(sb.toString())){
                        System.out.println(sb.toString());
                        tmp = true;
                    }
                }
            }
            if (tmp == false) System.out.println("WRONG PROBLEM!");
        }
    }
}
