public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        double total = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            total += i;
        }
        double average = total / numbers.length;
        System.out.println("Your total : " + total);
        System.out.println("Your average : " + average);
    }
}
