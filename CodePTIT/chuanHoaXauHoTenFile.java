import java.io.File;
import java.util.Scanner;

public class chuanHoaXauHoTenFile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true){
            String a = sc.nextLine();
            if (a.equals("END")) break;
            String[] s = a.trim().split("\\s+");
            for (int i = 0; i < s.length; i++){
                s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1).toLowerCase();
            }
            for (int i = 0; i < s.length; i++){
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }
}
