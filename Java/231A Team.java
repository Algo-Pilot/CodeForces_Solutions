import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int b=0,c=0,d=0,x=0;
        int a = sc.nextInt();
        for (int i = 0; i<a;i++){
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            if(b==1&&c==1){
                x++;
            }
            else if(b==1&&d==1){
                x++;
            }
            else if(c==1 && d==1){
                x++;
            }
        }
        System.out.println(x);
    }
}
