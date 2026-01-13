import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class loaiBoSoNguyen {

    public static boolean isInteger(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<>();
        while (sc.hasNext()){
            String s = sc.next();
            if (!isInteger(s)){
                arr.add(s);
            }
        }
        Collections.sort(arr);
        for (String x : arr) System.out.print(x + " ");
    }
}
