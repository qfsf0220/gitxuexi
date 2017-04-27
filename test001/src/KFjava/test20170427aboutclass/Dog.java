package KFjava.test20170427aboutclass;

/**
 * Created by Administrator on 2017/4/27.
 */
public class  Dog {
    public void jump(){
        System.out.println("jumpjump");
    }
    public void run(){
        Dog d = new Dog();
        d.jump();
        System.out.println("running");
    }

    public void runtoo(){
        this.jump(); //使用this引用调用run()方法的对象。
        //jump() 这个简写也是可以的。
        System.out.println("running2");
    }
}
