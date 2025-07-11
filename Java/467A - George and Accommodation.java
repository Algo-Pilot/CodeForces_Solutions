import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0 ;
        for(int i  = 0 ; i < num ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((b - a) >= 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
