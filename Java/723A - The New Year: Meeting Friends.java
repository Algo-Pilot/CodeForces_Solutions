import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = Math.abs(a - c) + Math.abs(b - c);
        int e = Math.abs(a - b) + Math.abs(b - c);
        int f = Math.abs(b - a) + Math.abs(a - c);
        if (f <= d && f <= e) {
            System.out.println(f);
        }
        else if (d <= f && d <= e) {
            System.out.println(d);
        }
        else if (e <= d && e <= f) {
            System.out.println(e);
        }
    }
}
