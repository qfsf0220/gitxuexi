package dongli.test170727.test20170802;
import java.util.*;
public class Thistest2 {
    int id ;
    public  Thistest2(){} //无参数构造方法
    public  Thistest2(int a){ //有参数构造方法
        this.id = a;
    }

    public void setId(int a){
        this.id = a;
    }
    public int  getId(){
        return id;
    }
    public static void main(String[]a){
        Thistest2 t2 = new Thistest2();
        Thistest2 t22 = new Thistest2(123);
        System.out.println(  t2.getId()  );//这里是默认值0
        //这里改名字
        t2.setId(789);
        System.out.println(t2.getId());
        System.out.println(t22.getId());
        System.out.println("qadsaf ");
    }
}
