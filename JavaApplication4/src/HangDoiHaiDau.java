import java.util.ArrayDeque;
import java.util.Deque;


public class HangDoiHaiDau {
    public static void main(String[] args){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(2);
        dq.addFirst(4);
        dq.addLast(5);
        dq.addLast(7);
        
        dq.pollFirst();
        dq.pollLast();
        
        for (int x : dq) System.out.print(x + " ");
        System.out.print("\n" + dq.peekLast());
    }
}
