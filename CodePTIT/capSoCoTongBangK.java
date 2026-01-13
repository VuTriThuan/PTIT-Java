import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class capSoCoTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            Long n = sc.nextLong(), k = sc.nextLong();
            ArrayList<Long> arr = new ArrayList<>();
            HashMap<Long, Long> mp = new HashMap<>();
            for (int i = 0; i < n; i++){
                Long x = sc.nextLong();
                arr.add(x);
                mp.put(x, mp.getOrDefault(x, (long)0) + 1);
            }
            Long cnt = (long)0;
            for (Map.Entry<Long, Long> entry : mp.entrySet()){
                if (mp.containsKey(k - entry.getKey()) && entry.getKey() != (k - entry.getKey())){
                    cnt += entry.getValue() * mp.get(k - entry.getKey());
                }
                if ((k - entry.getKey()) == entry.getKey()){
                    cnt += entry.getValue() * (entry.getValue() - 1);
                }
            }
            System.out.println(cnt / 2);
        }
    }
}
