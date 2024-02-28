import java.util.Scanner;

public class Main {
    static void primeNumber(int number){
        boolean asalMi = number == 2;
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                asalMi = false;
                break;
            }else {
                asalMi = true;
            }
        }
        if (asalMi){
            System.out.println(number + " Asal sayıdır.");
        }else {
            System.out.println(number + " Asal sayı değildir.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = input.nextInt();
        primeNumber(number);
    }
}