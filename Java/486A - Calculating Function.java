import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if(num % 2 == 0){
            System.out.printf("%.0f%n", num /2);
        }
        else{
            num++;
            System.out.printf("%.0f%n", - num / 2);
        }
    }
}
