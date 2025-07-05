import java.util.Scanner;
public class Main{
	public static void main (String[] args){
	    Scanner sc  = new Scanner(System.in);
	    int num = sc.nextInt();
	    int sub = sc.nextInt();
	    for(int i = 0; i < sub;i++){
	        if(num%10==0){
	            num = num /10;
	        }
	        else{
	            num =num-1;
	        }
	    }
	    System.out.println(num);
	}
}
