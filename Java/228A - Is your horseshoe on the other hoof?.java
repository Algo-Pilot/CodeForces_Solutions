import java.util.Scanner;
public class horseshoes{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[4];
        int count = 0;
        for(int i = 0; i < 4; i++){
            int a = sc.nextInt();
            int c = 0;
            for(int j = 0; j < 4; j++){
                if(arr[j] == a){
                    c++;
                    break;
                }
            }
            if(c != 1){
                arr[i] = a;
                count++;
            }
        }
        System.out.println(4 - count);
    }
}
