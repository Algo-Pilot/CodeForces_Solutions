import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < num; i++) {
            String s = sc.next();
            if (s.equals("Icosahedron")) {
                count += 20;
            }
            else if (s.equals("Cube")) {
                count += 6;
            }
            else if (s.equals("Tetrahedron")) {
                count += 4;
            }
            else if (s.equals("Dodecahedron")) {
                count += 12;
            }
            else if (s.equals("Octahedron")) {
                count += 8;
            }
        }
        System.out.println(count);
    }
}
