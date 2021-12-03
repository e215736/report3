package jp.ac.uryukyu.ie.e215736;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackTest(){
    int defaultWarriorAttack = 80;
    int defaultslimeHP =3000;
    Warrior demoWarrior = new Warrior("デモ戦士", 100, defaultWarriorAttack);
    Enemy slime = new Enemy("ビッグスライム", defaultslimeHP, 5);
    for(int i=0; i > 3;i++){
        int HP = slime.hitPoint;
        demoWarrior.attackWithWeaponSkill(slime);
        assertEquals(defaultWarriorAttack * 1.5, defaultslimeHP - HP);
    }
    }
}
