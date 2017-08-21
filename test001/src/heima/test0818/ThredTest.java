package heima.test0818;

/**
 * Created by Administrator on 2017/8/18.
     创建线程的方法
 1   定义类 继承 Thread
 2   复写 类中的 run方法
 3    调用 run方法   使用  start方法（2个作用。启动线程 ， 2调用run方法）
 */
public class ThredTest {
    public static void main(String[]a){
        Demo d = new Demo();
        d.start();
        for(int o =0;o<50;o++){
            System.out.println("main run "+o );
        }
    }
}
class Demo extends Thread{
    public  void run(){
        for(int i =0;i<50;i++){
            System.out.println("demo run "+i);
        }
    }
}
