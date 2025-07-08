import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner sc =  new Scanner(System.in);
        int length = sc.nextInt();
        String record  = sc.next();
        int counta = 0, countb = 0;
        for(int i = 0; i < length; i++){
            char c = record.charAt(i);
            if(c == 'A'){
                counta++;
            }
            else{
                countb++;
            }
        }
        if(counta > countb){
            System.out.println("Anton");
        }
        else if (countb > counta){
            System.out.println("Danik");
        }
        else if (counta == countb){
            System.out.println("Friendship");
        }
    }
}