import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0 ;
        int chk = 0;
        for(int i  = 0 ; i < num ; i++){
            int a = sc.nextInt();
            if(a == chk){
                continue;
            }
            else{
                count++;
                chk = a;
            }
        }
        System.out.println(count);
    }
}
