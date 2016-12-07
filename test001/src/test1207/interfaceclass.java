package test1207;

/**
 * 对象接口的使用
 * 接口的实例操作。
 *
 * @author feng.qian
 * @create at 2016-12-07 11:54
 */
interface USB{
    void start();
    void stop();
}

class C{
    public static  void work(USB u){
        u.start();
        System.out.println("working。。。");
        u.stop();
    }
}
class USBdisk implements USB {
    public void start() {
        System.out.println(" udisk  work...");
    }

    public void stop() {
        System.out.println(" udisk  stop...");
    }
}

class booter implements USB{
    @Override
    public void start() {
        System.out.println("booter work");
    }

    @Override
    public void stop() {
        System.out.println("booter stop...");
    }
}


class Printer implements USB{
    public void start(){
        System.out.println(" printer  work...");
    }
    public void stop(){
        System.out.println(" printer stop...");
    }
}


public class interfaceclass {
    public static void main(String[] args) {
        C.work(new USBdisk());
        C.work(new Printer());
    }
}
