package jp.ac.uryukyu.ie.e215736;

public class Enemy extends LivingThing{

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param hitPoint モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int hitPoint, int attack) {
        super(name, hitPoint,attack);
    }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
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