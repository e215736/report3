package jp.ac.uryukyu.ie.e215736;

public class Hero extends LivingThing{

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param hitPoint ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int hitPoint, int attack) {
        super(name, hitPoint,attack);
    }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);

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