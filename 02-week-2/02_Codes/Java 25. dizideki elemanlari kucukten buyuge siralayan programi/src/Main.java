import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of the Array : ");
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        System.out.println("Enter the elements of the array");
            for (int i = 0; i < array.length; i++) {
                System.out.print((i+1) + ". Element : ");
                array[i] = scanner.nextInt();
            }
        Arrays.sort(array);
        System.out.print("Array Sorting : ");
            for (int num : array){
                System.out.print(num + " ");
            }
    }
}