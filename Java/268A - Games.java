import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int [][] arr = new int[num][2];
        for(int i = 0; i < num; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i = 0; i < num; i++){
            for(int j =0; j< num; j++){
                if(j == i){
                    continue;
                }
                else{
                    for(int k = 0; k < 1; k++){
                        if(arr[i][0] == arr[j][1]){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
