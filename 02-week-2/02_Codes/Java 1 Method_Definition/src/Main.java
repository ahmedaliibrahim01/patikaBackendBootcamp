public class Main {
    // Defining a method that returns a value
    static int power(int base, int exp){
        int result= 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
    // Defining a method that does not return a value (Void)
    static void helloWorld(){
        System.out.println("Hello world!");
    }
    public static void main(String[] args) {
        // What is the method
        // f(x) = 2x + 5
        // f(6) = 2*6 + 5 = 17
        // f(x,y,z) = 3x + 2y + 5z
        // f(2,3,4) = 3*2 + 2*3 + 5*4 = 26

        // Calling a method that returns a value
        int returnMethod = power(2,4);
        System.out.println(returnMethod);

        // Calling a method that does not return a value (Void)
        helloWorld();
    }
}