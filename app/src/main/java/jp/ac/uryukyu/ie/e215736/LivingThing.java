package jp.ac.uryukyu.ie.e215736;

/**
 * 生き物クラス
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。

 */

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing (String name, int hitPoint, int attack) {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name キャラ名
     * @param hitPoint キャラのHP
     * @param attack キャラの攻撃力
     */
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }
    /**
     * 保持する真偽を返します。
     * ＠return　true or false
     */
    public boolean isDead(){
        return this.dead;
    }

    /**
     * 保持する名前を返します。
     * ＠return 名前
     */
    public String getName(){
        return this.name;
    }

    /**
     * あるキャラからあるキャラへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        if(this.hitPoint > 0){
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
        }
        else{
            opponent.wounded(damage = 0);
        }
    }
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは力尽きてしまった。\n", name);

        }
    }
}
