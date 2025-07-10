import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int count = 0;
        for (int j = 1;; j++) {
            int copy = year + j;
            int copy1= copy;
            count = 0;
            boolean[] arr = new boolean[10];
            for (int i = 0; i < 4; i++) {
                int last = copy % 10;
                copy = copy / 10;
                if (arr[last] != true) {
                    arr[last] = true;
                    continue;
                }
                if (arr[last] == true) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(copy1);
                break;
            }
        }
    }
}
