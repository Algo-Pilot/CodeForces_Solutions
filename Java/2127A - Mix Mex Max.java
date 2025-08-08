import java.util.*;

public class GoodArrayChecker {
    static boolean isValid(int[] data) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : data) {
            if (num != -1) {
                uniqueNumbers.add(num);
            }
        }
        if (uniqueNumbers.isEmpty()) {
            return true;
        }
        if (uniqueNumbers.size() > 1) {
            return false;
        }
        int value = uniqueNumbers.iterator().next();
        return value > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases-- > 0) {
            int length = Integer.parseInt(scanner.nextLine());
            int[] numbers = new int[length];
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < length; i++) {
                numbers[i] = Integer.parseInt(input[i]);
            }

            if (isValid(numbers)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
