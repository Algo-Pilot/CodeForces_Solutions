import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        double sum = 0;
        for(int i = 0; i < a; i++){
            sum += sc.nextInt();
        }
        double e = sum / a;
        System.out.printf("%.12f%n",e);
    }
}
