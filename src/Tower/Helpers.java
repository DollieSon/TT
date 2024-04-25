package Tower;

public class Helpers {

    // add stats here and there
    public static void EquipArtifact(Artifact art, Hero He){
        He.setItem(art);
        art.setOwner(He);
    }
    public static void Fight(Tower player, Tower enemy){
        //reset health
        player.setHealth(player.getMaxHealth());
        enemy.setHealth(enemy.getMaxHealth());
        while((player.getHealth() > 0 && enemy.getHealth() > 0)){
            Hero good = player.getHeroTurn();
            Hero bad = enemy.getHeroTurn();
            if(good.getTurn() > bad.getTurn()){
                player.setHealth(player.getHealth() - bad.getDamage());
                System.out.println("Player takes Damage: " + bad.getDamage() + " " + bad.getName() + " Attacks");
                bad.setTurn(bad.getTurn()+bad.getSpeed());
            }else{
                enemy.setHealth(enemy.getHealth() - good.getDamage());
                System.out.println("Enemy takes Damage: " + good.getDamage()+ " " + good.getName() + " Attacks");
                good.setTurn(good.getTurn()+good.getSpeed());
            }
            System.out.println();
        }
        if(enemy.getHealth() < 0){
            System.out.println("Player Wins !!!!");
        }else{
            System.out.println("Enemy Wins !!!!");
        }
    }
}
