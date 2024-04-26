package Tower;

public abstract class Boon {
    public static enum boonAppyCategory{
        Equip,Attack,BattleStart
    }
    private BoonScaler scalar;
    private String Description;

    public Boon(BoonScaler scalar, String description, boonAppyCategory category) {
        this.scalar = scalar;
        Description = description;
        this.category = category;
    }

    private boonAppyCategory category;
    public abstract void Apply(int Level, Tower mainTower, Tower enemyTower, Guard owner);
}