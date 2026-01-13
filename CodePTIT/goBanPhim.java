import java.util.Scanner;
import java.util.Stack;

public class goBanPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        Stack<Character> cnt = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '<'){
                if (!st.isEmpty()){
                    cnt.push(st.lastElement());
                    st.pop();
                }
            }
            else if (s.charAt(i) == '>'){
                if (!cnt.isEmpty()){
                    st.push(cnt.lastElement());
                    cnt.pop();
                }
            }
            else if (s.charAt(i) == '-'){
                if (!st.isEmpty()) st.pop();
            }
            else st.push(s.charAt(i));
        }

        String res = "";
        while (!st.isEmpty()){
            cnt.push(st.lastElement());
            st.pop();
        }
        while (!cnt.isEmpty()){
            System.out.print(cnt.lastElement());
            cnt.pop();
        }
    }
}
