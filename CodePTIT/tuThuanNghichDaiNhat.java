import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class tuThuanNghichDaiNhat {

    public static boolean check(String s){
        for (int i = 0; i < (int)(s.length() / 2); i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();
        int maxx = 0;
        while (sc.hasNext()){
            String s = sc.next();
            arr.add(s);
            if (check(s)){
                maxx = Math.max(maxx, s.length());
                mp.put(s, mp.getOrDefault(s, 0) + 1);
            }
        }
        
        //luu cac tu da in
        HashSet<String> se = new HashSet<>();
        for (String x : arr){
            if (mp.containsKey(x) && x.length() == maxx && !se.contains(x)){
                System.out.println(x + " " + mp.get(x));
                se.add(x);
            }
        }
    }
}
