import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int count = 0;
        for(int i = 0;i < num.length();i++){
            char a = num.charAt(i);
            if(a == '4' || a == '7'){
                count++;
            }
        }
        if(count == 4 || count == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}
