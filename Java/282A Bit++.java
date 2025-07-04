import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String b = "";
        int c = 0;
        int a = sc.nextInt();
        for (int i = 0; i < a; i++){
            b = sc.next();
            String x = "++X", x1 = "X++";
            String y = "--X", y1 = "X--";
            if(b.equals(x)){
                ++c;
            }
            else if(b.equals(x1)){
                c++;
            }
            else if(b.equals(y1)){
                c--;
            }
            else if(b.equals(y)){
                --c;
            }
        }
        System.out.println(c);
    }
}
