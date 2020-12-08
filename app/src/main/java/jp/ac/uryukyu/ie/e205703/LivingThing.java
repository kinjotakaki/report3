package jp.ac.uryukyu.ie.e205703;

public class LivingThing {
    private String name;
    int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String _name,int _hitPoint,int _attack){
        this.name = _name;
        this.hitPoint = _hitPoint;
        this.attack = _attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }
    public boolean isDead(){
        return this.dead;
    }
    public String GetName(){
        return this.name;
    }
    public void attack(LivingThing opponent){
        if (this.dead == false){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.name, damage);
        opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは道半ばで力尽きてしまった。\n", name);
        }
    }
    
}