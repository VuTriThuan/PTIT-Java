import java.util.Scanner;
import java.util.Stack;

public class kiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++){
                if (!st.isEmpty()){
                    if(st.lastElement()=='(' && s.charAt(i) == ')') st.pop();
                    else if(st.lastElement()=='[' && s.charAt(i) == ']') st.pop();
                    else if(st.lastElement()=='{' && s.charAt(i) == '}') st.pop();
                    else st.push(s.charAt(i));
                }
                else st.push(s.charAt(i));
            }
            if (st.empty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
