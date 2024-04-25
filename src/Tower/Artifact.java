package Tower;

public abstract class Artifact {

    private Hero owner;
    public abstract void Apply();

    public Artifact setOwner(Hero owner) {
        this.owner = owner;
        return this;
    }
    public Hero getOwner() {
        return owner;
    }
}