import java.util.Scanner;

public class Main {
    // I wrote the Exponential Number Calculation method here.
    static int power(int base, int force){
        int total = 1;
        for (int i = 0; i < force; i++) {
            total *= base;
        }
        return total;
    }
    public static void main(String[] args) {
        // I wrote the variables and the process of getting data from the user here.
        Scanner input = new Scanner(System.in);
        int base, force, result;
        System.out.print("Enter the base value : ");
        base = input.nextByte();
        System.out.print("Enter the exponent value : ");
        force = input.nextByte();

        // I called the method and printed it to the screen.
        result = power(base,force);
        System.out.print("Result : " + result);
    }
}