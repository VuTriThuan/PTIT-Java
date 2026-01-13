
import java.util.Scanner;

public class xuLyVanBan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String[] a = sc.nextLine().toLowerCase().trim().split("[.?!]");
            for (String s : a){
                String[] ss = s.trim().split("\\s+");
                for (int i = 0; i < ss.length; i++){
                    if (i == 0){
                        ss[i] = ss[i].substring(0, 1).toUpperCase() + ss[i].substring(1, ss[i].length());
                    }
                    System.out.print(ss[i] + " ");
                }
                System.out.println();
            }
        }
    }
}


