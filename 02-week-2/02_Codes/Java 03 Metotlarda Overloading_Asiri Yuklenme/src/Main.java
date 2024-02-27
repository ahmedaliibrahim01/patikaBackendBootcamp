public class Main {

    static void print(){
        System.out.println("My name is Ahmed");
    }
    static void print(String name){
        System.out.println("Your name is : " + name);
    }

    static int print(int x, int y){
        int total = x+y;
        System.out.println("Yout total is : " + total);
        return total;
    }
    public static void main(String[] args) {
        print();
        print("Anab");
        print(5,6);
    }
}