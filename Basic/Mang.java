import java.util.ArrayList;
import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // //mang tinh
        // int[] a = new int[10];
        // for (int i = 0; i < 10; i++){
        //     a[i] = sc.nextInt();
        // }
        // for (int i = 0; i < 10; i++){
        //     System.out.println(a[i]);
        // }

        //mang dong
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        System.out.println(arr.contains(2)); //kiem tra 2 co trong mang khong
        
        arr.remove(2); //xoa chi so
        arr.remove((Object)(3)); //xoa gia tri

        System.out.println(arr.indexOf(2)); //tim vi tri phan tu 2


    }
}