import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class FileNP_SoKhacNhau {
    public static void main(String[] args) {
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
            TreeMap<Integer, Integer> mp = new TreeMap<>();
            for (int x : arr){
                mp.put(x, mp.getOrDefault(x, 0 ) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
