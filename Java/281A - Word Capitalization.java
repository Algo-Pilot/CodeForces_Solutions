import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = s.charAt(0);
        if(c>=97 && c<=122){
            c = c -32;
            char p = (char)c;
            String s1 = ""+p;
            for(int i = 1; i<s.length();i++){
                char b = s.charAt(i);
                s1= s1+b;
            }
            System.out.println(s1);
        }
        else{
            System.out.println(s);
        }
    }
}