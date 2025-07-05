import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int count = 0;
        if (s.length() == t.length()) {
            for (int i = 1; i <= s.length(); i++) {
                int c = s.charAt(i - 1);
                int p = t.charAt(s.length() - i);
                if (c == p) {
                    count++;
                }
            }
            if (count == s.length()) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        else {
            System.out.println("NO");
        }
    }
}