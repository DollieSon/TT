package Tower;

public class Hero {
    private String Name;
    private int Damage;
    private int Speed;
    private int Turn;
    private Boon Item;

    public String getName() {
        return Name;
    }

    public Hero setName(String name) {
        Name = name;
        return this;
    }

    public Hero(int damage, int speed, String Name) {
        Damage = damage;
        Speed = speed;
        Turn = Speed;
        this.Name = Name;
    }
    public int getDamage() {
        return Damage;
    }

    public Hero setDamage(int damage) {
        Damage = damage;
        return this;
    }

    public int getSpeed() {
        return Speed;
    }

    public Hero setSpeed(int speed) {
        Speed = speed;
        return this;
    }
    public int getTurn() {
        return Turn;
    }

    public Hero setTurn(int turn) {
        Turn = turn;
        return this;
    }

    public Hero setItem(Boon item) {
        Item = item;
        return this;
    }
}
