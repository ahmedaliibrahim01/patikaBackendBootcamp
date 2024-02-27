public class Main {
    static int toplam(int x, int y) {
    return x + y;
}
    static void toplam1(int x, int y) {
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        int t = toplam(5,2);
        System.out.println(t);
        // Çıktısı "7"

        toplam1(5,2);
        // Çıktısı "7"
    }
}
