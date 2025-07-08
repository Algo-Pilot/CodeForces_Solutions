import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int stops = sc.nextInt();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < stops; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (sum > max){
                max =sum;
            }
            sum = sum - a + b;
        }
        System.out.println(max);
    }
}