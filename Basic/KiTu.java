public class KiTu {
    public static void main(String[] args){
        char c = 'K';
        if (Character.isUpperCase(c)){
            System.out.println("UPPER");
        }
        else if (Character.isLowerCase(c)){
            System.out.println("LOWER");
        }
        else if (Character.isDigit(c)){
            System.out.println("DIGIST");
        }
        char a = Character.toLowerCase(c);
        System.out.println(a);
    }
}
