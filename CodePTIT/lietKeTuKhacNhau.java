import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class lietKeTuKhacNhau {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("VANBAN.in"));
            TreeSet<String> se = new TreeSet<>();
            while (sc.hasNext()){
                String s = sc.next().toLowerCase();
                se.add(s);
            }
            for (String x : se) System.out.println(x);
            sc.close();
        } catch(FileNotFoundException e){

        }
    }
}
