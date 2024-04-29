import Tower.*;
import Tower.Artifacts.TestArt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BoonScaler> scala = new ArrayList<BoonScaler>();
        scala.add(new BoonScaler(1, 12));
        scala.add(new BoonScaler(20, 33));
        scala.add(new BoonScaler(5, 10));
        scala.add(new BoonScaler(11, 100));
        Boon power = new TestArt(scala,"sunner");

        BoonScaler perfect = power.getScalar(15);
        System.out.println(perfect.getreqLevel() + " " + perfect.getScaler());


    }
}
