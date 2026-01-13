import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class IntSet{
    public int[] arr;
    public IntSet(int[] arr){
        this.arr = arr;
    }
    public IntSet union(IntSet b){
        HashSet<Integer> se = new HashSet<>();
        for (int i = 0; i < this.arr.length; i++){
            se.add(this.arr[i]);
        }
        for (int i = this.arr.length; i < this.arr.length + b.arr.length; i++){
            se.add(b.arr[i - this.arr.length]);
        }
        int k = 0;
        int[] c = new int[se.size()];
        for (int x : se){
            c[k] = x;
            k++;
        }
        Arrays.sort(c);
        return new IntSet(c);
    }
    public String toString(){
        String res = "";
        for (int x : this.arr){
            res += String.valueOf(x) + " ";
        }
        return res;
    }
}

public class lopINTSET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
