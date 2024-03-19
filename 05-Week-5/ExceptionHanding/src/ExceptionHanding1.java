import java.util.Scanner;

public class ExceptionHanding1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Number 2 : ");
        int number2 = scanner.nextInt();


        int result;
        try {
             result = number1 / number2;

        }catch (ArithmeticException e){
            System.out.println("Bir sayı 0 bölünemez : " + e);
            System.out.print("Enter Again Number 2 : ");
            number2 = scanner.nextInt();
        }
        result = number1 / number2;
        System.out.println(result);
    }
}
