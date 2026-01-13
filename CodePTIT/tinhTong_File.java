import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tinhTong_File {
    public static void main(String[] args) {
        long tong = 0;
        try{
            Scanner sc = new Scanner(new File("DATA.in"));
            while (sc.hasNext()){
                String token = sc.next();  // đọc từng "từ" trong file
                try {
                    // parseInt sẽ ném NumberFormatException nếu không phải số nguyên hợp lệ
                    int x = Integer.parseInt(token);
                    tong += x;
                } catch (NumberFormatException e) {
                    // bỏ qua nếu không phải số nguyên
                }
            }
            System.out.println(tong);
            sc.close();
        } catch(FileNotFoundException e){

        }
    }
}
