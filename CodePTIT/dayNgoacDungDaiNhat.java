import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class dayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            int[] arr = new int[s.length()];
            for (int i = 0; i < s.length(); i++){
                if (!st.isEmpty() && s.charAt(st.lastElement()) == '(' && s.charAt(i) == ')'){
                    for (int j = st.lastElement(); j <= i; j++) arr[j] = 1;
                    st.pop();
                }
                else st.push(i);
            }

            int maxx = 1;
            int i = 1, cnt = 0;
            while (i < s.length()){
                if (arr[i] != 0) arr[i] = arr[i - 1] + 1;
                maxx = Math.max(maxx, arr[i]);
                i++;
            }
            System.out.println(maxx);
        }
    }
}


// 3
// ((()
// )()())
// ()(()))))
