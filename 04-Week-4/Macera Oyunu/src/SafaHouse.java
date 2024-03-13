public class SafaHouse extends NormalLocation{

    public SafaHouse(Player player) {
        super(player, "Enliven Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli Evdesiniz");
        System.out.println("Canınız yenilendi");
        this.getPlayer().setHealth(this.getPlayer().getOrginalHealth());
        return true;
    }
}
