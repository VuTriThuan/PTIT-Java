import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Time{
    public int gio, phut, giay;
    public Time(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public String toString(){
        return this.gio + " " + this.phut + " " + this.giay;
    }
}

public class sapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> t = new ArrayList<>();
        while (n-- > 0){
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            Time x = new Time(gio, phut, giay);
            t.add(x);
        }
        Collections.sort(t, new Comparator<Time>(){
            public int compare(Time t1, Time t2){
                if (t1.gio == t2.gio){
                    if (t1.phut == t2.phut){
                        return t1.giay - t2.giay;
                    }
                    else return t1.phut - t2.phut;
                }
                else return t1.gio - t2.gio;
            }
        });
        for (Time x : t) System.out.println(x);
    }
}
