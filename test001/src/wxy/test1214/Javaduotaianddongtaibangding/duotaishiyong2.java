package wxy.test1214.Javaduotaianddongtaibangding;

/**
 * 多态的一个好处是：当子类比较多时，也不需要定义多个变量，可以只定义一个父类类型的变量来引用不同子类的实例。
 *
 * @author feng.qian
 * @create at 2016-12-14 11:42
 */


public class duotaishiyong2 {
    public static void main(String[] args){
        // 借助多态，主人可以给很多动物喂食
        Master ma = new Master();
        ma.feed(new dongwu(), new Food());
        ma.feed(new mao(), new Fish());
        ma.feed(new gou(), new Bone());
    }
}
// dongwu类及其子类
class dongwu {
    public void eat(Food f){
        System.out.println("我是一个小动物，正在吃" + f.getFood());
    }
}
class mao extends dongwu{
    public void eat(Food f){
        System.out.println("我是一只小猫咪，正在吃" + f.getFood());
    }
}
class gou extends dongwu{
    public void eat(Food f){
        System.out.println("我是一只狗狗，正在吃" + f.getFood());
    }
}
// Food及其子类
class Food{
    public String getFood(){
        return "事物";
    }
}
class Fish extends Food{
    public String getFood(){
        return "鱼";
    }
}
class Bone extends Food{
    public String getFood(){
        return "骨头";
    }
}
// Master类
class Master{
    public void feed(dongwu an, Food f){
        an.eat(f);
    }
}