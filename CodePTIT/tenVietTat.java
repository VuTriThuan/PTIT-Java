import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Ten{
    public String hoTen, tat, ho, ten;
    public Ten(String hoTen){
        this.hoTen = hoTen;
        tat = "";
        String[] a = hoTen.trim().split("\\s+");
        ho = a[0];
        ten = a[a.length - 1];
        for (String s : a){
            tat += s.charAt(0) + ".";
        }
        tat = tat.substring(0, tat.length() - 1);
    }
    public String toString(){
        return this.hoTen;
    }
}

public class tenVietTat {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Ten> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0){
            arr.add(new Ten(sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<Ten>() {
            public int compare(Ten a, Ten b){
                if (a.ten.equals(b.ten)) return a.ho.compareTo(b.ho);
                return a.ten.compareTo(b.ten);
            }
        });
        int k = sc.nextInt();
        sc.nextLine();
        String[] a = new String[k];
        for (int i = 0; i < k; i++) a[i] = sc.nextLine();
        for (String s : a){
            for (Ten x : arr){
                if (x.tat.length() != s.length()) continue;
                boolean check = true;
                for (int i = 0; i < x.tat.length(); i++){
                    if (x.tat.charAt(i) != s.charAt(i) && s.charAt(i) != '*'){
                        check = false;
                        break;
                    }
                }
                if (check) System.out.println(x);
            }
        }
    }
}
