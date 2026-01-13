import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class soKhacNhauTrongFile {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.IN"));
            TreeMap<Integer, Integer> mp = new TreeMap<>();
            while (sc.hasNext()){
                int x = Integer.valueOf(sc.next());
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            sc.close();
        } catch(FileNotFoundException e){

        }
    }
}
