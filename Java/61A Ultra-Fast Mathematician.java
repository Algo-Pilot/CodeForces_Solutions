import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                result.append('1');
            } else {
                result.append('0');
            }
        }
        System.out.println(result.toString());
    }
}