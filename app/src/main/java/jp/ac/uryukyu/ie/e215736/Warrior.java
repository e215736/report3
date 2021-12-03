package jp.ac.uryukyu.ie.e215736;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 戦士名
     * @param hitPoint 戦士のHP
     * @param attack 戦士の攻撃力
     */
public class Warrior extends LivingThing{
    public Warrior(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }
    /**
     * 戦士からあるキャラへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * 攻撃力が常時1.5倍となる。
     * @param opponent 攻撃対象
     */
    public void attackWithWeaponSkill(LivingThing opponent){
            int damage = (int)(1.5 * attack);
            if(this.hitPoint > 0){
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
            }
            else{
                opponent.wounded(damage = 0);
            }

    }
    /**
     * 保持するHPを返します。
     * ＠return HP
     */
    public int getHitPoint(){
        return this.hitPoint;
    }
}
