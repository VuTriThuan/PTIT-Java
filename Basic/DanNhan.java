public class DanNhan {
    public static void main(String[] args) {
        lap: for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                if (i == 2 && j == 5){
                    break lap;
                }
            }
        }
    }
}
