import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class FileNP_SoNguyenTo {

    public static int[] prime = new int[10005];
    public static void solve(){
        for (int i = 2; i <= 10000; i++) prime[i] = 1;
        for (int i = 2; i <= 100; i++){
            if (prime[i] == 1){
                for (int j = i * i; j <= 10000; j += i) prime[j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        try {
            solve();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
            ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
            ois.close();
            int[] cnt = new int[10001];
            for (int x : list) {
                if (x >= 2 && x <= 10000 && prime[x] == 1)
                    cnt[x]++;
            }
            for (int i = 2; i <= 10000; i++) {
                if (cnt[i] > 0)
                    System.out.println(i + " " + cnt[i]);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
