import java.util.Scanner;

public class dienTichTamGiac {
    public static double doDai(double x1, double y1, double x2, double y2){
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            double x1 = sc.nextDouble(), y1 = sc.nextDouble();
            double x2 = sc.nextDouble(), y2 = sc.nextDouble();
            double x3 = sc.nextDouble(), y3 = sc.nextDouble();
            double d12 = doDai(x1, y1, x2, y2);
            double d23 = doDai(x2, y2, x3, y3);
            double d31 = doDai(x1, y1, x3, y3);
            if (Math.max(Math.max(d12, d23), d31) * 2 >= (d12 + d23 + d31)){
                System.out.println("INVALID");
            }
            else{
                double p = (d12 + d23 + d31) / 2;
                double s = Math.sqrt(p * (p - d12) * (p - d23) * (p - d31));
                System.out.println(String.format("%.2f", s));
            }
        }
    }
}
