import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oneRow = 0;
        int oneCol = 0;
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 5; j++) {
                if (input.nextInt() == 1) {
                    oneRow = i;
                    oneCol = j;
                }
            }
        }
        int moves = Math.abs(oneRow - 2) + Math.abs(oneCol - 2);
        System.out.println(moves);
    }
}
