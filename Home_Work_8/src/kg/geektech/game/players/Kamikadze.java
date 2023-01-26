package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Kamikadze extends Hero{
    boolean check = RPG_Game.random.nextBoolean();
    int kaeficient = RPG_Game.random.nextInt(2) + 1;
    public Kamikadze(int health, int damage, String name) {
        super(health, damage, SuperAbility.JERTVA, name);
    }

    @Override
    public int applySuperPower(Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0 && this.getHealth() > 0 && boss.getDefence() != SuperAbility.JERTVA && proverka() == 1){
        boss.setHealth(boss.getHealth() - (this.getHealth() / kaeficient));
        this.setHealth(0);
        if (kaeficient == 1){
            System.out.println("Kamikadze dead");
        } else {
            System.out.println("Kamikadze не попал");
        }
        }
        return 0;
    }
    private int proverka(){
        if (check){
            return 1;
        } else {
            return 0;

        }
    }
}
