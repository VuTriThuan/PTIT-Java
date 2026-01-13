import java.util.Scanner;

class SoPhuccc{
    public int a, b;
    public SoPhuccc(int a, int b){
        this.a = a;
        this.b = b;
    }
    public SoPhuccc cong(SoPhuccc p){
        return new SoPhuccc(this.a + p.a, this.b + p.b);
    }
    public SoPhuccc nhan(SoPhuccc p){
        return new SoPhuccc(this.a*p.a-this.b*p.b, this.a*p.b+this.b*p.a);
    }
    public String toString(){
        return this.a + " + " + this.b + "i";
    }
}

public class soPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int a1 = sc.nextInt(), b1 = sc.nextInt();
            int a2 = sc.nextInt(), b2 = sc.nextInt();
            SoPhuccc p1 = new SoPhuccc(a1, b1);
            SoPhuccc p2 = new SoPhuccc(a2, b2);
            SoPhuccc x = p1.cong(p2).nhan(p1);
            SoPhuccc y = p1.cong(p2).nhan(p1.cong(p2));
            System.out.println(x + ", " + y);
        }
    }
}
