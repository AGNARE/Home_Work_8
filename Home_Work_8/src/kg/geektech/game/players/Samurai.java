package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Samurai extends Hero {
    private boolean abillityChekused;
    private int virus = RPG_Game.random.nextInt(20) + 10;
    private int vaccine = RPG_Game.random.nextInt(100) + 50;
    private boolean ckek = RPG_Game.random.nextBoolean();
    private boolean ckecWhichSuriken = RPG_Game.random.nextBoolean();

    public Samurai(int health, int damage, String name) {
        super(health, damage, SuperAbility.SUREKEN, name);
    }

    private int cheking() {
        if (ckek) {
            return 1;
        } else return 0;
    }

    private int CheckShuriken() {
        if (ckecWhichSuriken) {
            return 1;
        } else return 0;
    }

    @Override
    public int applySuperPower(Boss boss, Hero[] heroes) {
        if (cheking() == 1 && this.getHealth() > 0 && boss.getDefence() != SuperAbility.SUREKEN && CheckShuriken() == 1 && !abillityChekused) {
            boss.setHealth(boss.getHealth() - virus);
            abillityChekused = true;
            System.out.println("Samurai used virus " + virus);
        } else if (cheking() == 1 && this.getHealth() > 0 && boss.getDefence() != SuperAbility.SUREKEN && CheckShuriken() == 0 && !abillityChekused) {
            boss.setHealth(boss.getHealth() + vaccine);
            abillityChekused = true;
            System.out.println("Samurai used vaccine " + vaccine);
        }
        return 0;
    }
}



