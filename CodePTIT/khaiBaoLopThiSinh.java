import java.util.Scanner;

class ThiSinh{
    private String ten, gt, ns, dc, msv, thue, ngay;
    public ThiSinh(String ten, String gt, String ns, String dc, String thue, String ngay){
        this.ten = ten;
        this.gt = gt;
        this.ns = ns;
        this.dc = dc;
        this.msv = "00001";
        this.thue = thue;
        this.ngay = ngay;
    }
    public String toString(){
        return this. msv + " " + this.ten + " " + this.gt + " " 
        + this.ns + " " + this.dc + " " + this.thue + " " + this.ngay;
    }
}

public class khaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String gt = sc.nextLine();
        String ns = sc.nextLine();
        String dc = sc.nextLine();
        String thue = sc.nextLine();
        String ngay = sc.nextLine();
        ThiSinh s = new ThiSinh(ten, gt, ns, dc, thue, ngay);
        System.out.println(s);
    }
}

// Nguyen Van Hoa
// Nam
// 22/11/1982
// Mo Lao-Ha Dong-Ha Noi
// 8333123456
// 31/12/2013