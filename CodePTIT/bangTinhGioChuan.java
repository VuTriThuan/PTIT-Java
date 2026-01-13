import java.util.ArrayList;
import java.util.Scanner;

class MonHoc{
    public String maMH, tenMH;
    public MonHoc(String s){
        String[] a = s.trim().split("\\s+");
        maMH = a[0];
        }
}

class GiangVien{
    public String maGV, tenGV;
    public GiangVien(String s){
        String[] a = s.trim().split("\\s+");
        maGV = a[0];
        tenGV = "";
        for (int i = 1; i < a.length; i++) tenGV += a[i] + " ";
        }
}

class ThoiGian{
    public MonHoc mh;
    public GiangVien gv;
    public double t;
    public ThoiGian(MonHoc mh, GiangVien gv, double t){
        this.mh = mh;
        this.gv = gv;
        this.t = t;
        }
    public String toString(){
        return this.gv.tenGV + String.format("%.2f", this.t);
        }
    }

public class bangTinhGioChuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         ArrayList<MonHoc> a = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
         for (int i = 0; i < n; i++) a.add(new MonHoc(sc.nextLine()));

         ArrayList<GiangVien> b = new ArrayList<>();
         int m = sc.nextInt();
            sc.nextLine();
         for (int i = 0; i < m; i++) b.add(new GiangVien(sc.nextLine()));

         ArrayList<ThoiGian> c = new ArrayList<>();
         int k = sc.nextInt();
        sc.nextLine();
         for (int i = 0; i < k; i++){
            String[] s = sc.nextLine().trim().split("\\s+");
            String maGV = s[0], maMH = s[1];
            double t = Double.valueOf(s[2]);
            int x = 0, y = 0;
            for (int j = 0; j < n; j++){
                if (maMH.equals(a.get(j).maMH)){
                    x = j;
                    break;
                }
            }
            for (int j = 0; j < m; j++){
                if (maGV.equals(b.get(j).maGV)){
                    y = j;
                    break;
        }
            }
            c.add(new ThoiGian(a.get(x), b.get(y), t));
         }
         for (ThoiGian x : c) System.out.println(x);
    }
}
// 2
// INT1155 Tin hoc co so 2
// INT1306 Cau truc du lieu va giai thuat
// 2
// GV01 Nguyen Van An
// GV02 Hoang Binh Minh
// 2
// GV01 INT1155 113.2
// GV02 INT1306 126.72