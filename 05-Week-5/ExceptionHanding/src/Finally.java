import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = {1,2,3,4};
        int element = scanner.nextInt();
        try {
            float result = 40/0f;
            element = number[element];
            System.out.println(element);
        }catch (Exception e){
            System.out.println("Listin dişina çıktın");
        }finally {
            System.out.println("Bu kod her koşulda ve her zaman çalışır");
        }

        System.out.println("Bu kod çalıştı");
    }
}

