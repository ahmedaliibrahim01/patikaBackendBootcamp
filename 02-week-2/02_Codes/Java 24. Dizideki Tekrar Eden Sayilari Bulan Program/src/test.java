import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] array = {10,20,20,10,10,20,5,20};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i] + ", ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]){
                    System.out.print(array[i] + " ");
                    break;
                }
                System.out.println();
            }

        }

        Scanner input = new Scanner(System.in);
        input.close();
    }
}
