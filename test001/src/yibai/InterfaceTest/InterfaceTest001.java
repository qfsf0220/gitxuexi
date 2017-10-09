package yibai.InterfaceTest;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Administrator on 2017/10/9.
 */
public class InterfaceTest001 {
    public static void main(String[] args) {
        ren r = new ren();
        r.dd();
        robot r2 = new robot();
        r2.dd();
        walkable [] w =new walkable[2];
            w[0]=new ren();
            w[1]=new robot();
            w[0].dd();w[1].dd();
        System.out.println("-------");
            walkables.letwalk(w);//letwalk类方法直接引用 接口类型参数。
        }
    }
interface walkable{
    String dd();
}
class ren implements  walkable{
    public  String  dd(){
        System.out.println("ren");
        return "this is a ren";
    }
}
class robot implements  walkable{
    public String dd(){
        System.out.println("robot");
        return "this is a robot";
    }
}
class walkables{ //walkables 的 letwalk 方法来使用   接口参数类型
    public static void letwalk(walkable[]list){
        for (walkable w :list){
            w.dd();
        }
    }
}

