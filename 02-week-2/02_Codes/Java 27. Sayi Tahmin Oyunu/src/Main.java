import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);

        int right = 0;
        boolean isWin = false, isWrong = false;
        int[] wrongNumber = new int[5];
        while (right < 5){
            System.out.print("Guess the number : ");
            int randNumber = scanner.nextInt();
            wrongNumber[right] = randNumber;
            if (randNumber < 0 || randNumber > 99){
                System.out.println("Please enter a number between 0 - 100.");
                if (isWrong){
                    right++;
                    System.out.println("You entered too many incorrectly. Your remaining right : " + (5-right));
                }else {
                    isWrong = true;
                    System.out.println("If you enter it incorrectly again, you will be deducted from your life..");
                }
                continue;
            }
            right++;
            if (randNumber == rand){
                System.out.println("Congratulations, You won");
                isWin = true;
            }else {
                if (right == 5){
                    continue;
                }
                System.out.println("You entered the wrong number, please try again.");
                System.out.println("Kalan Canın : " + (5 - right));
                isWin = false;
            }
        }
        if (!isWin){
            System.out.println("You lost.");
            System.out.println("Your wrong guesses : " + Arrays.toString(wrongNumber));
            System.out.println("Right guess : " + rand);
        }

    }
}