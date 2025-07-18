import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for (int i = 0; a > 0; i++) {
            if (a >= 100) {
                count++;
                a = a - 100;
            }
            else if (a >= 20) {
                count++;
                a = a - 20;
            }
            else if (a >= 10){
                count++; a = a - 10;
            }
            else if (a >= 5) {
                count++;
                a = a - 5;
            }
            else if (a >= 1) {
                count++;
                a = a - 1;
            }
        }
        System.out.println(count);
    }
}
