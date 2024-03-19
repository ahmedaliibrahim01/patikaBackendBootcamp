import java.util.Scanner;

public class ExceptionHanding2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = {1,2,3,4};
        int element = scanner.nextInt();
        try {
            element = number[element];
            System.out.println(element);
        }catch (Exception e){
            System.out.println("Listin dişina çıktın");
        }

        System.out.println("Bu kod çalıştı");
    }
}
