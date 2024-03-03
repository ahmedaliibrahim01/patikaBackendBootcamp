import java.util.Arrays;
import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        int[] test = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        for (int i = 0; i < test.length; i++) {
            test[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(test));

    }
}
