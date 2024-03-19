import java.io.IOException;

public class ThrowAndThrows {
    public static void age(int age) throws IOException {
        if (age < 18){
            throw new IOException();
        }else {
            System.out.println("Yasal yaştasınız");
        }
    }
    public static void main(String[] args) throws IOException {
        age(14);
    }
}
