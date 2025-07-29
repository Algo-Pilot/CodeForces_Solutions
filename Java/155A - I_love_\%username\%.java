import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        int low = y;
        int high = y;
        for(int i = 1; i < a;i++ ){
            int x = sc.nextInt();
            if(x > high){
                count++;
                high = x;
            }
            if(x < low){
                count++;
                low = x;
            }
        }
        System.out.println(count);
    }
}
