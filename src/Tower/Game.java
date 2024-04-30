package Tower;

import Tower.*;

import java.util.ArrayList;

public class Game {
    private Tower Player;
    private int CurrentLevel;

    private Tower Enemy;
    public Game(Tower player, int currentLevel, Tower startEnemy) {
        Player = player;
        CurrentLevel = currentLevel;
        Enemy = startEnemy;
    }
    public void moveUpLevel(){
        CurrentLevel+=1;
        ArrayList<Guard> Guards = Player.getGuards();
        for(Guard g: Guards){
            ArrayList<BoonSlot> boonSlots = g.getSlots();
            for(BoonSlot bs: boonSlots){
                if(bs.getLevel() >= CurrentLevel){
                    switch (bs.getBoonType()){
                        case STATIC:
                            if(bs.isActivated() == false){
                                bs.setActivated(true);
                                Boon B = bs.getEquipedBoon();
                                int ScalarPower = B.getScalar(CurrentLevel).getScaler();
                                B.Apply(ScalarPower,Player,Enemy,g);
                            }
                            break;
                        case GROWTH:
                            break;
                        case PERFECT:
                            break;
                    }
                }
            }
        }
    }
}
