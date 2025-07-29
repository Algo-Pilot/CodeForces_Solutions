
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num ; i++){
            int count = 0;
            int x = sc.nextInt();
            ArrayList <Integer> arr = new ArrayList<>();
            int div = 10;
            while(true){
                int a = x % div;
                if( a > 0){
                    count++;
                    arr.add(a);
                }
                if(x / div == 0){
                    break;
                }
                x = x /div;
                x = x * div;
                div = div * 10;
                
            }
            System.out.println(count);
            for(int j = 0; j < count; j++){
                if((count -1) != j){
                    System.out.print(arr.get(j) + " ");
                }
                else{
                    System.out.println(arr.get(j));
                }
            }
        }
    }
}
