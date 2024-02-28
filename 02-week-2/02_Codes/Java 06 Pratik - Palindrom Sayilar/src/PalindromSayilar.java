import java.util.Scanner;

public class PalindromSayilar {

    static boolean isPalidrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp / 10;
        }
        if (number == reverseNumber){
            System.out.println("Number : " + number + " Is Palindrom Number");
            return true;
        }else {
            System.out.println("Number : " + number + " It isn't Palindrom Number");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = input.nextInt();
        isPalidrom(number);
    }
}