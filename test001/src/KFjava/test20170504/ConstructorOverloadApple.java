package KFjava.test20170504;

/**
 * Created by Administrator on 2017/5/5.
 */
public class ConstructorOverloadApple {
    public String name;
    public String color;
    public double weight;
    public ConstructorOverloadApple(){
        System.out.println("构造器1");
    }
    public ConstructorOverloadApple(String applename,String applecolor){
        this .name= applename;
        this.color= applecolor;
        System.out.println("构造器2");
    }
    public ConstructorOverloadApple(String name,String color ,double weight){
        this(name,color);//通过this调用另一个重载的构造器的初始化代码。
        this.weight=weight;//这个this引用构造器正在初始化的对象。
        System.out.println("构造器3");
    }
    public static  void main(String []args){
        ConstructorOverloadApple coa = new ConstructorOverloadApple("apple","red",5.5);
        System.out.println(coa.color+" "+coa.name+" "+coa.weight);
    }
}
