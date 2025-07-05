import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        a = a.toLowerCase();
        b = b.toLowerCase();
        int x = a.compareTo(b);
        if(x>0){
            System.out.println("1");
        }
        else if(x<0){
            System.out.println("-1");
        }
        else{
            System.out.println("0");
        }
    }
}