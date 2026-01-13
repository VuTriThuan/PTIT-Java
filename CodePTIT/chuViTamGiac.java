import java.util.Scanner;

class Point{
    private double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point p1){
        return Math.sqrt((p1.x - this.x)*(p1.x - this.x) + (p1.y - this.y)*(p1.y - this.y));
    }
}

public class chuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            double x1 = sc.nextDouble(), y1 = sc.nextDouble();
            double x2 = sc.nextDouble(), y2 = sc.nextDouble();
            double x3 = sc.nextDouble(), y3 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);
            double d12 = p1.distance(p2);
            double d23 = p2.distance(p3);
            double d31 = p3.distance(p1);
            if (Math.max(Math.max(d23, d31), d12) * 2 >= (d12 + d23 + d31)){
                System.out.print("INVALID");
            }
            else System.out.printf("%.3f", (d12 + d23 + d31));
            System.out.println();
        }
    }
}
