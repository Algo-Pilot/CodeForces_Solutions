import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i<a;i++){
            String  s = sc.next();
            int slength = s.length();
            if (slength > 10){
                int nsl = slength - 2;
                String ns = ""+s.charAt(0)+nsl+s.charAt(slength-1);
                System.out.println(ns);
            }
            else{
                System.out.println(s);
            }
        }
    }
}
