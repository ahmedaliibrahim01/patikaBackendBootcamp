public class Main {
    public static void main(String[] args) {
        // Nesne oluşturma
        Car bmw = new Car();

        // Özellikler belirleme
        bmw.type = "A2021";
        bmw.model = "2024";
        bmw.color = "Black";
        bmw.speed = 360;

        // Davranışları belirleme
        bmw.increaseSpeed(50);
        bmw.printSpeed();;
    }
}