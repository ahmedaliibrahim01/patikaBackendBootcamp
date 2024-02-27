public class Main {
    static int f(int n{
     if (n == 1){
         return 1;
     }
     return f(n-1) + n;
    }
    public static void main(String[] args) {
        System.out.println(f(3));
        // f(4) = (f3) + 4
        // f(3) = (f2) + 3
        // f(2) = (f1) + 2
        // f(1) = 1

        // f(n) = f(n-1) + n;

    }
}