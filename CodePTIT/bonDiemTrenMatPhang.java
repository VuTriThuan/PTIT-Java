import java.util.ArrayList;
import java.util.Scanner;

class Point3D{
    public int x, y, z;
    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D tichCoHuong(Point3D b){
        Point3D r = new Point3D(this.y*b.z-this.z*b.y, this.z*b.x-this.x*b.z, this.x*b.y-this.y*b.x);
        return r;
    }
    public int tichVoHuong(Point3D b){
        return this.x*b.x+this.y*b.y+this.z*b.z;
    }
    public static boolean check(Point3D p0, Point3D p1, Point3D p2, Point3D p3){
        Point3D v01 = new Point3D(p1.x - p0.x, p1.y - p0.y, p1.z - p0.z);
        Point3D v02 = new Point3D(p2.x - p0.x, p2.y - p0.y, p2.z - p0.z);
        Point3D v03 = new Point3D(p3.x - p0.x, p3.y - p0.y, p3.z - p0.z);
        Point3D tch = v01.tichCoHuong(v02);
        return v03.tichVoHuong(tch) == 0;
    }
}
public class bonDiemTrenMatPhang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        int t = sc.nextInt();
    while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
                        
            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}

