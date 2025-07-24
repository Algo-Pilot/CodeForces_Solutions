import java.util.Scanner;
public class aII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            if (b >= 3) {
               if( b % 2 == 0){
                   System.out.println(b / 2 - 1);
               }
               else{
                   System.out.println(b /2);
               }
            }
            else {
                System.out.println(0);
            }
        }
    }
}
