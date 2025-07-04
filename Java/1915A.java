import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x, y, z;
        for (int i = 1; i<=a;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            if(x==y){
                System.out.println(z);
            }
            else if (x==z){
                System.out.println(y);
            }
            else{
                System.out.println(x);
            }
        }
    }
}
