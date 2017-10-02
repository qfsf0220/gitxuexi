package test170926;

import javax.lang.model.element.NestingKind;

/**
 * Created by qf on 2017/10/2.
 */
public class TestOOP_001 {
    public static void main(String[] args) {
        MobileUser mu = new MobileUser("1","1","1",1);
        System.out.println( mu.getinfo()  );


    }
}
class MobileUser{
    private  String mobile;
    private  String user;
    public String model;
    private int level;

    MobileUser(String mobile,String user,String model,int level){
        this.mobile =mobile;
        this.user =user;
        this.model = model;
        this.level = level;
    }
    public String getinfo(){

        return "User is "+user;
    }
}
