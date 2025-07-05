import java.util.Scanner;
public class Main{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        int length = username.length();
        String s ="";
        for (int i = 97; i <= 122;i++){
            int trigger = 0;
            for(int j =0 ;j < length; j++){
                int c = username.charAt(j);
                if(c==i){
                    trigger++;
                    break;
                }
            }
            if(trigger==1){
                char c= (char)i;
                s=s+c;
            }
        }
        int final_length = s.length();
        if(final_length%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else if(final_length%2!=0){
            System.out.println("IGNORE HIM!");
        }
    }
}