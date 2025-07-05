import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int x= 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < a; i++){
            int d = sc.nextInt();
            if(d>0){
                if(i==b-1){
                    x = x + d;
                }
                else if(x > d) {
                    break;
                }
                c++;
            }
        }
        System.out.println(c);
    }
}