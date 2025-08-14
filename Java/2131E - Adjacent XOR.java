import java.util.*;

public class SequenceXorCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (!input.hasNextInt()) {
            return;
        }
        int cases = input.nextInt();

        while (cases-- > 0) {
            int length = input.nextInt();
            long[] arr1 = new long[length];
            long[] arr2 = new long[length];

            for (int i = 0; i < length; i++) {
                arr1[i] = input.nextLong();
            }
            for (int i = 0; i < length; i++) {
                arr2[i] = input.nextLong();
            }

            if (arr1[length - 1] != arr2[length - 1]) {
                System.out.println("NO");
                continue;
            }

            long[] diff = new long[length - 1];
            for (int i = 0; i < length - 1; i++) {
                diff[i] = arr1[i] ^ arr2[i];
            }

            boolean possible = true;
            for (int idx = 0; idx < length - 1 && possible; ) {
                if (diff[idx] == 0) {
                    idx++;
                    continue;
                }
                int cursor = idx;
                while (true) {
                    if (diff[cursor] == arr1[cursor + 1]) {
                        idx = cursor + 1;
                        break;
                    }
                    if (cursor == length - 2) {
                        possible = false;
                        break;
                    }
                    if (diff[cursor + 1] != (diff[cursor] ^ arr1[cursor + 1])) {
                        possible = false;
                        break;
                    }
                    cursor++;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
        input.close();
    }
}
