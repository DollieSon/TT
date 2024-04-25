package Tower;

public abstract class Boon {

    private Hero owner;
    public abstract void Apply();

    public Boon setOwner(Hero owner) {
        this.owner = owner;
        return this;
    }
    public Hero getOwner() {
        return owner;
    }
}