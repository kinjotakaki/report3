package jp.ac.uryukyu.ie.e205703;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest{
    /**
     * [テスト内容]warriorの攻撃力が1.5倍になっているが確認
     * (1)戦士と敵を準備する
     * (2)
     */
    @Test
    void Warriortest(){
        for (int i =0;i<3;i++){
        int defaultWarriorHP = 100;
        Warrior warrior = new Warrior("上級勇者", defaultWarriorHP,10);
        Enemy enemy = new Enemy("スライム",100,2);
        warrior.attackWithWeponSkill(enemy);
        enemy.attack(warrior);
        assertEquals((int)((warrior.damage0)*1.5),((int)(warrior.damage1)));
}
}
}