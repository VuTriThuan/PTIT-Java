import java.util.Scanner;

class Pair<U, V>{
    public U first;
    public V second;
    public Pair(U first, V second){
        this.first = first;
        this.second = second;
    }
    public boolean isPrime(){
        int n1 = ((Number) this.first).intValue();
        int n2 = ((Number) this.second).intValue();
        if (n1 < 2) return false;
        for (int i = 2; i < (int)(Math.sqrt(n1)) + 1; i++){
            if (n1 % i == 0) return false;
        }
        if (n2 < 2) return false;
        for (int i = 2; i < (int)(Math.sqrt(n2)) + 1; i++){
            if (n2 % i == 0) return false;
        }
        return true;
    }
    public String toString(){
        return this.first + " " + this.second;
    } 
}

public class lopPair {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
