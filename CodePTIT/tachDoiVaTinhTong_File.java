import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;
import java.io.File;

public class tachDoiVaTinhTong_File {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNext()){
                String s = sc.next();
                while (s.length() > 1){
                    String a = s.substring(0, s.length() / 2);
                    String b = s.substring(s.length() / 2, s.length());
                    BigInteger x = new BigInteger(a);
                    BigInteger y = new BigInteger(b);
                    s = x.add(y).toString();
                    System.out.println(s);
                }
            }
            sc.close();
        }catch(FileNotFoundException e){

        }
    }
}
