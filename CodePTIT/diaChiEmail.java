import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class diaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> v = new ArrayList<>();
        sc.nextLine();
        for (int test = 0; test < t; test++) {
            String a = sc.nextLine();
            String[] s = a.trim().split("\\s+");
            String res = "";
            for (int i = 0; i < s.length; i++){
                s[i] = s[i].toLowerCase();
                if (i != s.length - 1) res += s[i].charAt(0);
            }
            res = s[s.length - 1] + res;
            v.add(res);
            //dem so lan xuat hien cua res
            int cnt = Collections.frequency(v, res);
            if (cnt == 1) System.out.println(res + "@ptit.edu.vn");
            else System.out.println(res + cnt + "@ptit.edu.vn");
        }
        
    }
}
// 4
//     nGUYEn    quaNG   vInH  
//    tRan   thi THU    huOnG
//    nGO   quoC  VINH
//  lE            tuAn    aNH
