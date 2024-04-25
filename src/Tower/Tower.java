package Tower;

import java.util.ArrayList;
public class Tower {
    public static final int MAXHEROES = 3;
    int Health,MaxHealth;
    private ArrayList<Hero> Guards;

    private int currTurn;
    public Tower(int maxHealth) {
        Health = maxHealth;
        MaxHealth = maxHealth;
        Guards = new ArrayList<Hero>();
        currTurn = 0;
    }

    public int getHealth() {
        return Health;
    }

    public int getMaxHealth() {
        return MaxHealth;
    }

    public Tower setHealth(int health) {
        Health = health;
        return this;
    }

    public Tower addGuard(Hero guard){
        if(Guards.size() < 3){
            Guards.add(guard);
        }
        return this;

    }
    public Hero getHeroTurn(){
        Hero MinHero = Guards.get(0);
        for(Hero H: Guards){
            if(MinHero.getTurn() > H.getTurn()){
                MinHero = H;
            }
        }
        return MinHero;
    }
    public void resetHeroTurns(){
        for(Hero H: Guards){
            H.setTurn(H.getSpeed());
        }
    }
}
