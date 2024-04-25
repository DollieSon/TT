import Tower.*;

import javax.swing.*;
import java.security.GuardedObject;

public class Main {
    public static void main(String[] args) {
        Tower Mc = new Tower(10);
        Hero Chelsy = new Hero(10,5,"Chelsy");
        Mc.addGuard(Chelsy);

        Tower Enemy = new Tower(20);
        Hero Golbin = new Hero(1, 5,"Golbin");
        Enemy.addGuard(Golbin);

        Helpers.Fight(Mc,Enemy);
        System.out.println(Mc.getHealth());

    }
}
