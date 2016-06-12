/**
 * Created by ShannonB on 6/11/2016.
 * Prompt user for input and convert their input to a binary number.
 */
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.Math.floorDiv;
import static java.lang.Math.floorMod;


public class convertBinary {



    public static void toBinary(int n) {
        int quotient;
        int result;
        ArrayList binary = new ArrayList();
        if(n == 0){
            System.out.print(0);
        }else{
            do {
                quotient = floorDiv(n, 2);
                result = floorMod(n, 2);
                binary.add(0, result);
                n = quotient;
            }while(quotient != 0);
        }
        for (Object aBinary : binary) {
            System.out.print(aBinary);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ans;
        do {
            System.out.println("Please enter a number: ");
            int number = scan.nextInt();
            System.out.println("The binary value of " + number + " is: ");
            toBinary(number);
            System.out.println();
            System.out.println("Would you like to find another binary value?");
            ans = scan.next();
        } while (ans.equalsIgnoreCase("YES"));
        scan.close();
        System.out.println("Goodbye!");

    }
}
