import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 0; i < input; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a % b== 0){
                System.out.println("0");
            }
            else{
                int div = (a / b) + 1;
                System.out.println((div * b) - a);
            }
            
        }
    }
}
