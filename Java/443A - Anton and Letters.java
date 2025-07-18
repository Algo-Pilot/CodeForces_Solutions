import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        boolean [] arr = new boolean[26];
        for(int i = 0;;i++){
            int a = s.charAt(i);
            if(a == 125){
                break;
            }
            else if(a == 123 || a == 44 || a == 32){
                continue;
            }
            else if(a>=97 && a <= 122){
                if(arr[a - 97] != true){
                    arr[a - 97] = true;
                    count++;
                }
                else{
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}
