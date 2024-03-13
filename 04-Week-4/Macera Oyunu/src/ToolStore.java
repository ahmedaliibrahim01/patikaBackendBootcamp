public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "Mağza");
    }

    @Override
    public boolean onLocation() {
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("Welcome to Store");
            System.out.println("1 - Sılahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış Yap");
            System.out.print("Seçiminiz :");
            int selectCase = scanner.nextByte();
            while (selectCase < 1 || selectCase > 3) {
                System.out.print("Geçersiz değer, tekrar girinizz :  ");
                selectCase = scanner.nextByte();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Bir daha bekleriz");
                    showMenu = false;
                    return true;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("--------Sılahlar--------");
        System.out.println();
        for (Weapon weapon : Weapon.weapons()) {
            System.out.println(weapon.getId() + " - " + weapon.getName() + " = Para : " + weapon.getPrice() + " , Hasar : " + weapon.getDamage());
        }
        System.out.println("0 - Çıkış yap");
    }

    public void buyWeapon() {
        System.out.print("Bir sılah seçiniz : ");
        int selectWeaponID = scanner.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Geçersiz değer, tekrar giriniz :  ");
            selectWeaponID = scanner.nextInt();
        }

        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli Paranız bulunmamaktadır");
                } else {
                    // Satın alma gerekleştiği alan.
                    System.out.println(selectedWeapon.getName() + " Sılahı satın aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Paranız : " + this.getPlayer().getMoney());
                    System.out.println("Önceki Sılahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni Sılahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }
    }

    public void printArmor() {
        System.out.println("--------Zırhlar--------");
        System.out.println();
        for (Armor armor : Armor.armor()) {
            System.out.println(armor.getId() + " - " + armor.getName() +
                    " = Para : " + armor.getPrice() + ", Zırh : " + armor.getBlock());
        }
        System.out.println("0 - Çıkış yap");

    }

    public void buyArmor() {
        System.out.print("Bir Zırh seçiniz : ");
        int selectArmorID = scanner.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armor().length) {
            System.out.print("Geçersiz değer, tekrar giriniz :  ");
            selectArmorID = scanner.nextInt();
        }

        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli Paranız bulunmamaktadır");
                } else {
                    // Satın alma gerekleştiği alan.
                    System.out.println(selectedArmor.getName() + " Zıhr satın aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Paranız : " + this.getPlayer().getMoney());
                    System.out.println("Önceki Zıhrınız : " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Yeni Zıhrınız : " + this.getPlayer().getInventory().getArmor().getName());
                }
            }
        }
    }
}
