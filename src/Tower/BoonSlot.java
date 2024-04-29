package Tower;

public class BoonSlot {

    public enum TYPE{
        STATIC,GROWTH,PERFECT
    }
    private TYPE boonType;
    private Boon equipedBoon;
    private int Level;// level to be unlocked
    private boolean isActivated;

    public BoonSlot(TYPE boonType, int level) {
        this.boonType = boonType;
        Level = level;
        isActivated = false;
    }

    public TYPE getBoonType() {
        return boonType;
    }

    public BoonSlot setBoonType(TYPE boonType) {
        this.boonType = boonType;
        return this;
    }

    public BoonSlot setActivated(boolean activated) {
        isActivated = activated;
        return this;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public Boon getEquipedBoon() {
        return equipedBoon;
    }

    public BoonSlot setEquipedBoon(Boon equipedBoon) {
        this.equipedBoon = equipedBoon;
        return this;
    }

    public int getLevel() {
        return Level;
    }

    public BoonSlot setLevel(int level) {
        Level = level;
        return this;
    }

    public BoonSlot(TYPE boonType, Boon equipedBoon, int level) {
        this.boonType = boonType;
        this.equipedBoon = equipedBoon;
        Level = level;
    }
}
