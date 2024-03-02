import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] harmonik = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        double total = 0;

        for (int i = 0; i < harmonik.length; i++) {
            total = total + (1 / harmonik[i]);
        }

        System.out.println(harmonik.length/total);

        double[] numbers = {1, 2, 3,4,5,6,7,8,9};
        double sum=0;

        for (int i=0;i < numbers.length; i++){
            sum = sum + (1 / numbers[i]);
        }

        System.out.println("Harmonic series average: " + ( numbers.length / sum));


    }
}