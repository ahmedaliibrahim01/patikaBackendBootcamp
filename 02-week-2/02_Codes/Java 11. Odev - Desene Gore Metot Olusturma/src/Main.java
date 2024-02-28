import java.util.Scanner;

public class Main {
    static void sequence(int number){

        if(number <= 0){
            System.out.print(number + " ");
            return;
        }
        System.out.print(number + " ");
        sequence(number-5);
        System.out.print(number + " ");
    }
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int number = input.nextInt();
        System.out.print("Çıktısı : ");
        sequence(number);
        //System.out.println("Çıktısı : " + sequence(number));
    }
}