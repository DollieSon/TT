package Tower;

import Tower.*;

import java.util.ArrayList;

public class Game {
    private Tower Player;
    private int CurrentLevel;

    public Game(Tower player, int currentLevel) {
        Player = player;
        CurrentLevel = currentLevel;
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
