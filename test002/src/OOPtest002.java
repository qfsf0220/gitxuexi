/**
 * Created by qfsf on 2017/10/4.
 */
public class OOPtest002 {
    public static void main(String[] args) {
        Mobile m = new Mobile("dange", "S8+", 1);
        m.getinfo();
        Mobile2 m2 = new Mobile2("xiaohuozi", "IP7", 2);
        m2.getinfo();
        m2.getinfo(32);
        Mobile2 m22 = new Mobile2("zhangzong", "IP7", 2);
        m22.getinfo();
        m22.getinfo(64);
    }
}

class Mobile {
    private String user;
    private String model;
    public int level;
    Mobile(String user,String model,int level){
        this.user=user;
        this.model=model;
        this.level = level;

    }
    public void getinfo(){
        System.out.println( user+"'s "+model+" is number."+level+"!" );
    }
}

class Mobile2 extends  Mobile{
    Mobile2(String user,String model,int level){
        super(user,model,level);
    }
    public  void getinfo(int size){
        System.out.println("The disk is "+size+"G.");
    }

}