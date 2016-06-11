import java.util.Scanner;

/**
 * Created by ShannonB on 6/11/2016.
 * Simple function that implements a recursive call.
 */
public class recursive {

    public static int Factorial(int n) {
        if(n == 0){
           return 1;
        }else {
            return n * Factorial(n-1);
        }
    }

    public static void main(String[] args) {
        String ans;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("What number would you like to find the factorial of?");
            int number = scan.nextInt();
            System.out.println("The factorial of " + number + " is: " + Factorial(number));
            System.out.println("Would you like to find another factorial?");
            ans = scan.next();
        }while(ans.toLowerCase().equals("yes"));
        System.out.println("Goodbye!");
        scan.close();
    }

}
