package dongli.test170727.test20170802;

/**
 * Created by Administrator on 2017/8/2.
 */
public class test引用 {
    String name;
    float hp;
    int speed;

    public static void main(String[]a){
        //创建一个对象。
        new test引用();

        //用一个引用指向这个对象。
        test引用 t = new test引用();
        t.hp=100;
        System.out.println(t.hp);

        test引用 t3 = t; //t3 指向 t所指向的对象。
        test引用 t99 = t; //t99 指向 t
        test引用 t123 = t99; //t123 指向 t99

        test引用 t789 = t;

        t=new test引用();//这里t 指向了一个新创建的对象 new test引用 ，所以 16行的t已经没有引用了。

        System.out.println(t.hp);
        weapon w = new weapon();
        w.setWeapon("awp");

        System.out.println(t.name+"'s"+w.getWeapon());


    }
}

class weapon extends test引用{
    String weapon;

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public static void main(String[]arf){
        weapon w = new weapon();
        w.name="qq";
        w.weapon=" M4";
        System.out.println(w.name+"'s"+w.weapon);
    }


}
