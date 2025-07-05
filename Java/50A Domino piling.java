import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mltp = a *b;
        if(mltp % 2==0){
            System.out.println(mltp/2);
        }
        else{
            System.out.println(mltp--/2);
        }
    }
}