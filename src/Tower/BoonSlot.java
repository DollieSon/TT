package Tower;

public class BoonSlot {
    private int boonType;
    private Boon equipedBoon;
    private int Level;

    public int getBoonType() {
        return boonType;
    }

    public BoonSlot setBoonType(int boonType) {
        this.boonType = boonType;
        return this;
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

    public BoonSlot(int boonType, Boon equipedBoon, int level) {
        this.boonType = boonType;
        this.equipedBoon = equipedBoon;
        Level = level;
    }
}
