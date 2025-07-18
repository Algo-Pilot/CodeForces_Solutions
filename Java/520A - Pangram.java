import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean[] arr = new boolean[26];
        String sr = sc.next();
        String s = sr.toUpperCase();
        for (int i = 0; i < a; i++) {
            int x = s.charAt(i);
            if (arr[x - 65] == true) {
                continue;
            }
            else {
                arr[x - 65] = true;
            }

        }
        int count = 0;
        if (a < 26) {
            System.out.println("NO");
        }
        else {
            for (int i = 0; i < 26; i++) {
                if (arr[i] != true) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
