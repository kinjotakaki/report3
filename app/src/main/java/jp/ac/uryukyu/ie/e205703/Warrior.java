package jp.ac.uryukyu.ie.e205703;

public class Warrior extends Hero {
    int damage0 = 0;
    int damage1 = 0;
    public Warrior(String Name,int Hitpoint,int Attack){
        super(Name,Hitpoint,Attack);
    }
    public void attackWithWeponSkill(LivingThing a){
        if (this.isDead() == false){
        int nomal_damage = (int)(Math.random() * attack);
        int high_damage2 = (int)(nomal_damage*1.5);
        damage0 +=nomal_damage;
        damage1 +=high_damage2;
        System.out.printf("%sの攻撃！ウェスポンスキルを発動！%sに%dのダメージを与えた！！\n", GetName(), a.GetName(), high_damage2);
        a.wounded(high_damage2);
    }
    
}
}