import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;


public class SapXep {
    public static void main(String[] args) {
        //mang tinh
        Integer[] a = {1,3,4,5,2};
        Arrays.sort(a, 0, 5);
        for (int x : a){
            System.out.print(x + " ");
        }

        //mang dong
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : a){
            list.add(x);
        }
        Collections.sort(list);
        for (int x : list){
            System.out.print(x + " ");
        }

        //comparator
        Arrays.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return -1;
                else return 1;
            }
        });
        for (int x : a){
            System.out.print(x + " ");
        }
    }
}
