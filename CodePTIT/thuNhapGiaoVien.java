import java.util.Scanner;

public class thuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        int lcb = sc.nextInt();
        String cv = ma.substring(0, 2);
        int hs = Integer.valueOf(ma.substring(2, 4));
        int pc;
        if (cv.equals("HT")) pc = 2000000;
        else if (cv.equals("HP")) pc = 900000;
        else pc = 500000;
        int l = lcb * hs + pc;
        System.out.println(ma + " " + ten + " " + hs + " " + pc + " " + l);
    }
}
