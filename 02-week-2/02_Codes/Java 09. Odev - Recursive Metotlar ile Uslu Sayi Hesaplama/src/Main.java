import java.util.Scanner;

public class Main {
    // I wrote the Exponential Number Calculation method here.
    static int power(int base, int expo) { //define method here
        if (expo == 0) {   //the zeroth power equals one
            return 1;
        } else {
            return base * power(base, expo - 1);   // recursive portal starts here
        }
    }
    public static void main(String[] args) {
        // I wrote the variables and the process of getting data from the user here.
        Scanner input = new Scanner(System.in);
        int base, expo, result;
        System.out.print("Enter the base value : ");
        base = input.nextByte();
        System.out.print("Enter the exponent value : ");
        expo = input.nextByte();

        // I called the method and printed it to the screen.
        result = power(base,expo);
        System.out.print("Result : " + result);
    }
}