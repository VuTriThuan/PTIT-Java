
import java.math.BigInteger;

public class SoNguyenLon {
    public static void main(String[] args){
        BigInteger a = new BigInteger("1342341313");
        BigInteger b = new BigInteger("9787368135131515355");
        
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
        System.out.println(a.mod(b));

        System.out.println(a.add(b));

    }
}
