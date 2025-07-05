import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner sc =  new Scanner(System.in);
        int price = sc.nextInt();
        int dollar = sc.nextInt();
        int amount = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=amount;i++){
            sum = sum + (price*i);
        }
        if(sum >dollar){
            sum = sum - dollar;
            System.out.println(sum);
        }
        else{
            System.out.println(0);
        }
    }
}
