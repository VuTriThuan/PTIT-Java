import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class docFileVanBan {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File(("DATA.in")));
            while(sc.hasNext()){
                String res = sc.nextLine();
                System.out.println(res);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file DATA.in");
        }
    }
}
