import Tower.*;
import Tower.Artifacts.TestArt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


    }
    public void BoonscalerTest(){
        ArrayList<BoonScaler> scala = new ArrayList<BoonScaler>();
        scala.add(new BoonScaler(1, 12));
        scala.add(new BoonScaler(20, 33));
        scala.add(new BoonScaler(5, 10));
        scala.add(new BoonScaler(11, 100));
        Boon power = new TestArt(scala,"sunner");

        BoonScaler perfect = power.getScalar(15);
        System.out.println(perfect.getreqLevel() + " " + perfect.getScaler());
    }

    public void ApplyTestArtTest(){
        // create boon 1
        ArrayList<BoonScaler> scalers = new ArrayList<BoonScaler>();
        scalers.add(new BoonScaler(1, 31));
        scalers.add(new BoonScaler(21, 41));
        scalers.add(new BoonScaler(4, 4));
        scalers.add(new BoonScaler(5, 131));
        scalers.add(new BoonScaler(12, 31));
        scalers.add(new BoonScaler(9, 31));
        Boon B1 = new TestArt(scalers, "Boon 1 Test");

        //create boon 2
        scalers = new ArrayList<BoonScaler>();
        scalers.add(new BoonScaler(2, 31));
        scalers.add(new BoonScaler(11, 41));
        scalers.add(new BoonScaler(52, 3));
        scalers.add(new BoonScaler(31, 131));
        scalers.add(new BoonScaler(33, 11));
        scalers.add(new BoonScaler(93, 51));
        Boon B2 = new TestArt(scalers, "Boon 2 Test");

        //create boon slots
        BoonSlot Slot1 = new BoonSlot(BoonSlot.TYPE.STATIC,B1,13);
        BoonSlot Slot2 = new BoonSlot(BoonSlot.TYPE.STATIC,B2,23);
        BoonSlot Slot3 = new BoonSlot(BoonSlot.TYPE.STATIC,B1,31);
        BoonSlot Slot4 = new BoonSlot(BoonSlot.TYPE.STATIC,B2,33);
        BoonSlot Slot5 = new BoonSlot(BoonSlot.TYPE.STATIC,B1,40);

        ArrayList<BoonSlot> Slots1 = new ArrayList<BoonSlot>();
        Slots1.add(Slot1);
        Slots1.add(Slot2);
        Slots1.add(Slot3);
        Slots1.add(Slot4);
        Slots1.add(Slot5);

        BoonSlot Slot6 = new BoonSlot(BoonSlot.TYPE.STATIC,B1,13);
        BoonSlot Slot7 = new BoonSlot(BoonSlot.TYPE.STATIC,B2,23);
        BoonSlot Slot8 = new BoonSlot(BoonSlot.TYPE.STATIC,B1,31);
        BoonSlot Slot9 = new BoonSlot(BoonSlot.TYPE.STATIC,B2,33);
        BoonSlot Slot10 = new BoonSlot(BoonSlot.TYPE.STATIC,B1,40);

        ArrayList<BoonSlot> Slots2 = new ArrayList<BoonSlot>();
        Slots2.add(Slot6);
        Slots2.add(Slot7);
        Slots2.add(Slot8);
        Slots2.add(Slot9);
        Slots2.add(Slot10);
        // Create Guard 1 and Guard 2
        Guard onlyG = new Guard(12,5,"mana",Slots1);

        Guard enemyGG = new Guard(1,41,"Something",Slots2);


        //create player tower

        //create enemy tower

        //move up
    }


}
