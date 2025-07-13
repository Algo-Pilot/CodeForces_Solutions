import java.util.Scanner;

public class solution705A {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int n = myscanner.nextInt(); // Read the number of layers

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { // Even layers are "I love"
                System.out.print("I love ");
            } else { // Odd layers are "I hate"
                System.out.print("I hate ");
            }

            if (i == n) { // If it's the last layer
                System.out.print("it");
            } else { // If it's not the last layer
                System.out.print("that ");
            }
        }
        myscanner.close(); // Close the scanner
    }
}
