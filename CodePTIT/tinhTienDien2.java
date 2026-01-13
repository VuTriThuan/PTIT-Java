import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class HoaDon{
    public String ma, loai;
    public long cu, moi, hs, tt, pt, tong;
    public HoaDon(int ma, String loai, long cu, long moi){
        this.ma = String.valueOf(ma);
        while (this.ma.length() < 2) this.ma = "0" + this.ma;
        this.ma = "KH" + this.ma;

        this.loai = loai;
        this.cu = cu;
        this.moi = moi;

        if (loai.equals("KD")) hs = 3;
        if (loai.equals("NN")) hs = 5;
        if (loai.equals("TT")) hs = 4;
        if (loai.equals("CN")) hs = 2;

        tt = (moi - cu) * hs * 550;

        if ((moi - cu) < 50) pt = 0;
        else if ((moi - cu) <= 100) pt = Math.round(tt / 100.0 * 35);
        else pt = tt;

        tong = pt + tt;
    }
    public String toString(){
        return this.ma + " " + this.hs + " " + this.tt + " " + this.pt + " " + this.tong;
    }
}

public class tinhTienDien2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HoaDon> arr = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++){
            sc.nextLine();
            arr.add(new HoaDon(i, sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        Collections.sort(arr, new Comparator<HoaDon>() {
            public int compare(HoaDon a, HoaDon b){
                return Long.compare(b.tong, a.tong);
            }
        });
        for (HoaDon x : arr) System.out.println(x);
    }
}
// 3
// KD
// 400
// 555
// NN
// 58
// 400
// CN
// 150
// 700