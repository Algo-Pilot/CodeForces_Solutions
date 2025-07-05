import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word  = sc.next();
        int count_cap = 0;
        int count_small = 0;
        for(int i = 0;i<word.length();i++){
            int c = word.charAt(i);
            if(c>=65 && c<=90){
                count_cap++;
            }
            else{
                count_small++;
            }
        }
        String new_word = "";
        if(count_cap > count_small){
            new_word = word.toUpperCase();
        }
        else{
            new_word = word.toLowerCase();
        }
        System.out.println(new_word);
 
    }
}