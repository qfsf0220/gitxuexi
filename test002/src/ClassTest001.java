import java.beans.Statement;

/**
 * Created by qfsf on 2017/10/5.
 */
public class ClassTest001
{
    public static void main(String[] args) {
        Mobile3 m3 = new Mobile3();
        String model = Mobile3.model;
        System.out.println(m3.memory);
        System.out.println(m3.screen);
        System.out.println(model);
        System.out.println("---");
        new Mobile3("xiaohuozi", "yangzong", "zhangzong");
        new Mobile3("qf");
    }
}

class Mobile3{
    static  String model="unknown";
    int memory ;
    int screen ;
    Mobile3(){}
    Mobile3(int memory,int screen,String model){
        this.memory = memory;
        this.screen=screen;
        this.model=model;
        System.out.println("<"+model+" "+memory+" "+screen+">");
    }
    Mobile3(String ...user){
        System.out.printf("The "+user.length+" %s:"+"\n",(user.length==1?"user is":"users are"));
        for(String i:user){
            System.out.println("\t\t\t"+i);
        }
    }
}
interface wuxianchongdian {
    void wuxianchongdianfunc();
}