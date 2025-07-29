import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = 240 - y;
        int sum = 0;
        int count  = 0 ;
        for(int i = 1; i <=x;i++ ){
            sum +=(5*i);
            if(sum <=r){
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
}
