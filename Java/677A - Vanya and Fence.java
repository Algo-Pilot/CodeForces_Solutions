import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int fence = sc.nextInt();
        int width = 0;
        for(int i = 0; i < total; i++){
            int height = sc.nextInt();
            if(height > fence){
                width += 2;
            }
            else{
                width += 1;
            }
        }
        System.out.println(width);
    }

}