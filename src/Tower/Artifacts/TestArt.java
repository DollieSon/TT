package Tower.Artifacts;

import Tower.*;

import java.util.Calendar;

public class TestArt extends Boon {
    boolean isEquipped;
    public TestArt(BoonScaler scalar, String description) {
        //should the category be built-in?
        super(scalar, description, boonAppyCategory.Equip);
        isEquipped = false;
    }

    @Override
    public void Apply(int Level, Tower mainTower, Tower enemyTower, Guard owner) {
        int newDamage = Level + owner.getDamage();
        if(!isEquipped){
            isEquipped = true;
        }else{
            newDamage*=-1;
            isEquipped = false;
        }
        owner.setDamage(newDamage);
    }
}
