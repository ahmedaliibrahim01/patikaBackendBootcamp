import java.util.Scanner;

public class Main {
    public static void findNumbers(int index){
        int[] numbers;
        try {
            numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            index = numbers[index];
            System.out.println("Number is : " + index);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You went out of Array : " + e);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index : ");
        int index = scanner.nextInt();
        findNumbers(index);
    }
}