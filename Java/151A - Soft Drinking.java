import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of friends
        int k = sc.nextInt(); // number of bottles
        int l = sc.nextInt(); // milliliters per bottle
        int c = sc.nextInt(); // number of limes
        int d = sc.nextInt(); // slices per lime
        int p = sc.nextInt(); // grams of salt
        int nl = sc.nextInt(); // milliliters of drink needed per toast per friend
        int np = sc.nextInt(); // grams of salt needed per toast per friend

        // Calculate total available drink in milliliters
        int totalDrinkML = k * l;
        // Calculate the number of toasts possible based on drink
        int toastsFromDrink = totalDrinkML / (n * nl);

        // Calculate total available lime slices
        int totalLimeSlices = c * d;
        // Calculate the number of toasts possible based on limes
        int toastsFromLimes = totalLimeSlices / n;

        // Calculate the number of toasts possible based on salt
        int toastsFromSalt = p / (n * np);

        // The maximum number of toasts each friend can make is limited by the minimum of these three
        int minToasts = Math.min(toastsFromDrink, Math.min(toastsFromLimes, toastsFromSalt));

        System.out.println(minToasts);

        sc.close();
    }
}
