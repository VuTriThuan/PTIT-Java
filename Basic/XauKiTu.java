import java.util.Scanner;
import java.util.StringTokenizer;

public class XauKiTu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); //nhập không có dấu cách
        sc.nextLine(); // cin.ignore()
        String ss = sc.nextLine(); //nhập có dấu cách
        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }




        s = ss.toUpperCase(); //In hoa ca xau ki tu




        //tách từ

        // StringTokenizer st = new StringTokenizer(ss, " ");
        // while(st.hasMoreTokens()){
        //     System.out.println(st.nextToken());
        // }
        String[] a = ss.split("\\s+");
        // String[] a = ss.trim().split("\\s+");    loại bỏ dấu cách ở đầu câu nếu có



        //Thay đổi xâu kí tự
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(4);
        sb.setCharAt(4, '@'); //thay doi
        System.out.println(sb.toString());
    }
}