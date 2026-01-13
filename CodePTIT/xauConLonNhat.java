import java.util.Scanner;
import java.util.Stack;

public class xauConLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            while (!st.isEmpty() && st.lastElement() < s.charAt(i)){
                st.pop();
            }
            st.add(s.charAt(i));
        }
        Stack<Character> res = new Stack<>();
        while (!st.isEmpty()){
            res.add(st.lastElement());
            st.pop();
        }
        while (!res.isEmpty()) {
            System.out.print(res.lastElement());
            res.pop();
        }
        System.out.println();
    }
}
