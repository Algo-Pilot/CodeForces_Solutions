import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (i % 4 == 0 ) {
                    if (j == b) {
                        System.out.println(".");
                    }
                    else if (j == 1) {
                        System.out.print("#");
                    }
                    else {
                        System.out.print(".");
                    }
                }
                else if (i % 2 == 0 ) {
                    if (j == b) {
                        System.out.println("#");
                    }
                    else {
                        System.out.print(".");
                    }
                }
                else {
                    if (j == b) {
                        System.out.println("#");
                    }
                    else {
                        System.out.print("#");
                    }
                }
            }
        }
    }
}
