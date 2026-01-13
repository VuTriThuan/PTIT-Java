
import java.util.Scanner;
import java.util.Stack;


public class RutGonXauKiTu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (!st.isEmpty()){
                if (s.charAt(i) == st.peek()) st.pop();
                else st.push(s.charAt(i));
            }
            else st.push(s.charAt(i));
        }
        if (!st.isEmpty()){
            Stack<Character> st2 = new Stack<>();
            while (!st.isEmpty()){
                st2.push(st.pop());
            }
            while (!st2.isEmpty()){
                System.out.print(st2.peek());
                st2.pop();
            }
        }
        else{
            System.out.print("Empty String");
        }
        System.out.println();
    }
}
