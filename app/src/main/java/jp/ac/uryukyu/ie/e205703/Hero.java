package jp.ac.uryukyu.ie.e205703;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 * 
 * ヒーロークラス。setterメソッド。
 * getname() //敵の名前
 * getHitPoint();//敵のHP
 * getAttack();//敵の攻撃力
 * getDead();//敵の生死状態。true=死亡。
 */
public class Hero extends LivingThing{
    public Hero(String name,int hitpoint,int attack){
    super(name,hitpoint,attack);
}
    
}