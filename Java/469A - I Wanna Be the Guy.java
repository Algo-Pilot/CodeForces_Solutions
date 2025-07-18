import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean[] arr = new boolean[a];
        for (int i = 0; i < 2; i++) {
            int x = sc.nextInt();
            for (int j = 0; j < x; j++) {
                int y = sc.nextInt();
                if (arr[y - 1] == true) {
                    continue;
                }
                else {
                    arr[y - 1] = true;
                }
            }
        }
        int count =0;
        for(int i =0 ; i < a; i++){
            if(arr[i] != true){
                count++;
                break;
            }
        }
        if(count > 0){
            System.out.println("Oh, my keyboard!");
        }
        else{
            System.out.println("I become the guy.");
        }
    }
}
