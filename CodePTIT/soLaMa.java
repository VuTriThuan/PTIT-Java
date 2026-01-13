import java.util.Scanner;

public class soLaMa {
    public static int quyDoi(Character c){
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = sc.nextLine();
            int i = 0;
            int res = 0;
            while (i < s.length()){
                if ((i + 1) < s.length() && quyDoi(s.charAt(i)) < quyDoi(s.charAt(i + 1))){
                    res += quyDoi(s.charAt(i + 1)) - quyDoi(s.charAt(i));
                    i += 2;
                }
                else{
                    res += quyDoi(s.charAt(i));
                    i++;
                }
            }
            System.out.println(res);
        }
    }
}
