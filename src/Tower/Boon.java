package Tower;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Boon {
    public static enum boonAppyCategory{
        Equip,Attack,BattleStart
    }
    private ArrayList<BoonScaler> scalar;
    private String Description;

    private boonAppyCategory category;
    public Boon(ArrayList<BoonScaler> scalar, String description, boonAppyCategory category) {
        Collections.sort(scalar,new BoonScaler.sortByreqLevel());
        this.scalar = scalar;
        Description = description;
        this.category = category;

    }

    public abstract void Apply(int Level, Tower mainTower, Tower enemyTower, Guard owner);

    public BoonScaler getScalar(int Level){
        BoonScaler res = new BoonScaler(0,-1);
        for(BoonScaler bs: scalar){
           if(bs.getreqLevel() > res.getreqLevel() && bs.getreqLevel() <= Level){
               res = bs;
           }
        }
        return res;
    }
}