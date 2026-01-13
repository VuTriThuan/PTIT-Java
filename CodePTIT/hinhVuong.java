import java.util.Scanner;

public class hinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int X1 = Math.min(x1, x3);
        int Y1 = Math.min(y1, y3);
        int X2 = Math.max(x2, x4);
        int Y2 = Math.max(y2, y4);

        int c1 = X2 - X1;
        int c2 = Y2 - Y1;
        System.out.println(Math.max(c1, c2) * Math.max(c1, c2));
    }
}
