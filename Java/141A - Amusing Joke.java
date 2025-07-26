import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String fin = a + b;
        int clength = c.length();
        int length = fin.length();
        boolean trigger = false;
        boolean[] x = new boolean[clength];
        if (clength == length) {
            for (int i = 0; i < length; i++) {
                int val = fin.charAt(i);
                boolean flag = false;
                for (int j = 0; j < clength; j++) {
                    int val2 = c.charAt(j);
                    if (val == val2 && x[j] == false) {
                        x[j] = true;
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    System.out.println("NO");
                    trigger = true;
                    break;
                }
            }
        }
        else {
            System.out.println("NO");
            trigger = true;
        }
        if (trigger == false) {
            System.out.println("YES");
        }
    }
}
