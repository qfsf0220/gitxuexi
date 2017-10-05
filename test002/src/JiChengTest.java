/**
 * Created by qfsf on 2017/10/5.
 */
public class JiChengTest {
    public static void main(String[] args) {
        sumsung s = new sumsung();
        s.printinfo();
        apple a = new apple();
        a.setModel("apple iphone7plus");
        a.setUser("xiaohuozi");
        a.printinfo();
    }
}
class Mobile004{
    private String model = "unknown";
    String user ;
    String haswuxianchongdian = "you";
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    public void setUser(String user) {
        this.user = user;
    }
    void printinfo(){
        System.out.println(user+"'s mobile is "+getModel());
    }
}
class sumsung extends Mobile004 {
    String model = "sumsung S8+";
    String user = "dange";

    void printinfo(){
        if(super.haswuxianchongdian.equals("you"))
        System.out.printf(this.user+"'s mobile is "+this.model+",%s\n",(super.haswuxianchongdian.equals("you")?"you wu xian chong dian ":"mei you wu xian chong dian"));
    }
}
class apple extends  Mobile004{

}