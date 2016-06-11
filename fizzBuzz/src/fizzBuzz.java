/**
 * Created by ShannonB on 6/11/2016.
 * Print the numbers 1-100
 * If the number is a multiple of 3, print "Fizz"
 * If the number is a multiple of 5, print "Buzz"
 * If the number is a multiple of 3 and 5, print "FizzBuzz"
 */
public class fizzBuzz {

    public static void main(String[] args) {
        for(int i =1; i <= 100; i++) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0) {
                System.out.println("Fizz");
            }else if(i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }

}
