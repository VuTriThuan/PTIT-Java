import java.util.Scanner;

class Point{
    public double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(), sc.nextDouble());
    }
}

class Triangle{
    public double a, b, c;
    public static double dis(Point a, Point b){
        return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
    }
    public Triangle(Point A, Point B, Point C){
        this.a = dis(A, B);
        this.b = dis(C, B);
        this.c = dis(A, C);
    }
    public boolean valid(){
        if (Math.max(Math.max(this.a, this.b), this.c) * 2 >= (this.a + this.b + this.c)) return false;
        return true;
    }
    public String getPerimeter(){
        return String.format("%.3f", this.a + this.b + this.c);
    }
}

public class lopTriagle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}