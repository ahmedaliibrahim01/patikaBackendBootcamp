import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int orginalHealth;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;
    Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        GameCharacter[] characterList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("----------------------Karaklerler--------------------");
        for (GameCharacter gameCharacter : characterList) {
            System.out.println(
                    "ID : " + gameCharacter.getId() +
                            "\t Karakter : " + gameCharacter.getName() +
                            "\t Hasar    : " + gameCharacter.getDamage() +
                            "\t Sağlık   : " + gameCharacter.getHealth() +
                            "\t Para     : " + gameCharacter.getMoney());
        }
        System.out.println("------------------------------------------------------");
        System.out.print("Lütfen bir karakter seçiniz : ");
        int selectChar = scanner.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
                break;
        }
        System.out.println("Karakrer :  " + this.getName() +
                ", Hasar : " + this.getDamage() +
                ", Sağlık : " + this.getHealth() +
                ", Para : " + this.getMoney());
    }

    public void initPlayer(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setOrginalHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        this.setName(gameCharacter.getName());
    }

    public void printInfo() {
        System.out.println("Karakrer :  " + this.getName() +
                ", Sılah : " + this.getInventory().getWeapon().getName() +
                ", Zıhr : " + this.getInventory().getArmor().getName() +
                ", Bloklama : " + this.getInventory().getArmor().getBlock() +
                ", Hasar : " + this.getTotalDamage() +
                ", Sağlık : " + this.getHealth() +
                ", Para : " + this.getMoney());
    }

    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0){
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Weapon getWeapon(){
        return this.getInventory().getWeapon();
    }

    public int getOrginalHealth() {
        return orginalHealth;
    }

    public void setOrginalHealth(int orginalHealth) {
        this.orginalHealth = orginalHealth;
    }
}
