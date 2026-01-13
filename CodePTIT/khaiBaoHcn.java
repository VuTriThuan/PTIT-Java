import java.util.Scanner;

class Hcn{
    private double x, y;
    private String color;
    public Hcn(){
        x = 1;
        y = 1;
    }
    public Hcn(double x, double y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public double getWidth(){
        return this.y;
    }
    public void setWidth(double newy){
        this.y = newy;
    }
    public double getHeight(){
        return this.x;
    }
    public void setHeight(double newx){
        this.x = newx;
    }
    public String getColor(){
        String res = "";
        for (int i = 0; i < this.color.length(); i++){
            if (i == 0){
                res += Character.toUpperCase(this.color.charAt(i));
            }
            else res += Character.toLowerCase(this.color.charAt(i));
        }
        return res;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public int findArea(){
        return (int)(this.x * this.y);
    }
    public int findPerimeter(){
        return (int)((this.x + this.y) * 2);
    }
}

public class khaiBaoHcn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String color = sc.next();
        if (x != (int)x || y != (int)y || x <= 0 || y <= 0) System.out.println("INVALID");
        else{
            Hcn a = new Hcn(x, y, color);
            System.out.println(a.findPerimeter() + " " + a.findArea() + " " + a.getColor());
            
        }
    }
}
