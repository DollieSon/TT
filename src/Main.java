import Tower.*;

public class Main {
    public static void main(String[] args) {
        Tower Mc = new Tower(10);
        Guard Chelsy = new Guard(10,5,"Chelsy");
        Mc.addGuard(Chelsy);

        Tower Enemy = new Tower(20);
        Guard Golbin = new Guard(1, 5,"Golbin");
        Enemy.addGuard(Golbin);

        Helpers.Fight(Mc,Enemy);
        System.out.println(Mc.getHealth());

    }
}
