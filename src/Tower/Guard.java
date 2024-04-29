package Tower;

import java.util.ArrayList;

public class Guard {
    private String Name;
    private int Damage;
    private int Speed;
    private int Turn;
    private ArrayList<BoonSlot> Slots;
    public String getName() {
        return Name;
    }

    public Guard setName(String name) {
        Name = name;
        return this;
    }

    public Guard(int damage, int speed, String Name, ArrayList<BoonSlot> Bs) {
        Damage = damage;
        Speed = speed;
        Turn = Speed;
        this.Name = Name;
        Slots = Bs;
    }
    public int getDamage() {
        return Damage;
    }

    public Guard setDamage(int damage) {
        Damage = damage;
        return this;
    }

    public int getSpeed() {
        return Speed;
    }

    public Guard setSpeed(int speed) {
        Speed = speed;
        return this;
    }
    public int getTurn() {
        return Turn;
    }

    public Guard setTurn(int turn) {
        Turn = turn;
        return this;
    }

    public ArrayList<BoonSlot> getSlots(){
        return Slots;
    }


}
