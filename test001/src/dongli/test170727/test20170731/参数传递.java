package dongli.test170727.test20170731;

import javax.jws.soap.SOAPBinding;

/**
 * Created by Administrator on 2017/8/1.
 */
public class 参数传递 {
    public static void main(String[]a){
        User uu=new User(22);
        参数传递.add(uu);
        System.out.println("main---"+uu.age);
    }

    public static void add(User xxx){
        xxx.age++;
        System.out.println("add---"+xxx.age);
    }
}


class User{
    int age;

    public User(int i){
        age=i;
    }
}
