import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int length = a.length();
        String nw = "";
        int j = 49;
        int count;
        for(int i = 1; i <= 9; i++){
            count = 0;
            for(int k = 1; k<=length;k++){
                int value = a.codePointAt(k-1);
                if(value == j){
                    count++;
                }
            }
            if (count>0){
                for(int x = 0; x < count; x++){
                    nw = nw + i +"+";
                }
            }
            j++;
        }
        String s = "";
        for (int i = 0; i< length;i++){
            char c= nw.charAt(i);
            s = s + c;
        }
        System.out.printf(s);
        
    }
}