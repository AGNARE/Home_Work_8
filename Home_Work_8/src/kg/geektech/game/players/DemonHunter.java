package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class DemonHunter extends Hero{
    //Создать героя DemonHunter добавить суперспособность
    //И применив способность урон к боссу составлял 50% и при этом улучшить урон всем игрокам на 5%


    public DemonHunter(int health, int damage, String name) {
        super(health, damage, SuperAbility.AXE , name);
    }

    @Override
    public int applySuperPower(Boss boss, Hero[] heroes) {  // надо сделать так чтоб демон применив способность урон к боссу составилял 50% и при этом улучшить урон героев на 5%
        if (boss.getHealth() > 0 && this.getHealth()> 0) {
            boss.setDamage(boss.getDamage() + 25);
            for (int i = 0; i <heroes.length ; i++) {
                heroes[i].setHealth(heroes[i].getHealth() * 2);
            }
            System.out.println("Demon used superpower");
        }

return 0;

}}
