import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            solveProblem(sc);
        }
        sc.close();
    }

    private static void solveProblem(Scanner sc) {
        int length = sc.nextInt();
        String strA = sc.next();
        String strB = sc.next();

        long[] prefixA = new long[length + 1];
        long[] prefixB = new long[length + 1];

        for (int i = 0; i < length; i++) {
            prefixA[i + 1] = prefixA[i] + (strA.charAt(i) - '0');
            prefixB[i + 1] = prefixB[i] + (strB.charAt(i) - '0');
        }

        long[] arrayA = new long[length];
        long[] arrayB = new long[length];

        for (int i = 0; i < length; i++) {
            arrayA[i] = 2 * prefixA[i + 1] - (i + 1);
            arrayB[i] = 2 * prefixB[i + 1] - (i + 1);
        }

        Arrays.sort(arrayB);

        long[] prefixSumB = new long[length + 1];
        for (int i = 0; i < length; i++) {
            prefixSumB[i + 1] = prefixSumB[i] + arrayB[i];
        }
        long totalSumB = prefixSumB[length];

        long absoluteSum = 0;
        for (long value : arrayA) {
            int pos = lowerBound(arrayB, -value);
            absoluteSum += value * (length - 2L * pos) + totalSumB - 2L * prefixSumB[pos];
        }

        long totalXY = (long) length * length * (length + 1L);
        long result = (totalXY - absoluteSum) / 2L;
        System.out.println(result);
    }

    private static int lowerBound(long[] arr, long key) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) >>> 1;
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
