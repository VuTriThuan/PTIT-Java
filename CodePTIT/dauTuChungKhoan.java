import java.util.Scanner;
import java.util.Stack;

public class dauTuChungKhoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] cnt = new int[n];
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                cnt[i] = 1;
            }
            for (int i = 0; i < n; i++){
                while (!st.isEmpty() && arr[st.lastElement()] <= arr[i]){
                    cnt[i] = i - st.lastElement() + cnt[st.lastElement()];
                    st.pop();
                }
                st.push(i);
            }
            for (int x : cnt) System.out.print(x + " ");
            System.out.println();
        }
    }
}
