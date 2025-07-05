import java.util.Scanner;
 
public class Stones{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        String word = reader.next();
        int count = 0;
        for(int i=1; i<word.length(); i++)
            if(word.charAt(i-1) == word.charAt(i))
                ++count;
        System.out.println(count);
    }
}