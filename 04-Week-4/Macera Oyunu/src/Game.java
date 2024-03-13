import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz. ");
        System.out.print("Lütfen bir isim giriniz : ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);
        System.out.println("Sayın : " + player.getName() + " Hoşgeldiniz.");
        System.out.println("Lütfen bir Karacter seçiniz .");
        player.selectChar();
        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println("________________________________");
            System.out.println("\nBölgeler");
            System.out.println("1 - Güvenli ev");
            System.out.println("2 - Dükkan");
            System.out.println("3 - Mağra -> Mağraya Git");
            System.out.println("4 - Orman -> Ormana Git");
            System.out.println("5 - Nehir -> Nehire Git");
            System.out.println("0 - Çıkış yap -> Oyunu sonlandır");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
            int selectLoc = scanner.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafaHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Lütfen Geçerli Bir bölge giriniz...");
                    break;
            }
            if (location == null){
                System.out.println("Oyun bitti, Yine Bekleriz....");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("Game Over !");
                break;
            }
        }
    }
}
