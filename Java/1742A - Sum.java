import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for (int i = 0; i < total; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if ((a + b) == c) {
                System.out.println("YES");
            }
            else if ((a + c) == b) {
                System.out.println("YES");
            }
            else if ((c + b) == a) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}
