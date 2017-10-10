package yibai.InterfaceTest;

/**
 * Created by Administrator on 2017/10/10.
 */
public class InterfaceTest005 {
    public static void main(String[] args) {
        System.out.println("do you have a audi?");
        System.out.println(xiaohuozi.hasaudi);
        xiaohuozic xc = new xiaohuozic() {
            @Override
            public String getpy() {
                return null;
            }};
        xc.chasegirlskill();

        System.out.println(xc instanceof xiaohuozi);
        System.out.println(xc instanceof yangzong);
        System.out.println(xc instanceof zhangzong);
    }
}
interface zhangzong{
    String getpy();
    boolean hasaudi= false;
}
interface  yangzong{
    void chasegirlskill();
    String getpy();
    boolean hasaudi= false;
}
interface xiaohuozi extends yangzong{
    boolean hasaudi=true;
    void chasegirlskill();
}
abstract class xiaohuozic implements xiaohuozi{
    public void chasegirlskill(){
        System.out.println("i have this skill.");
    }
}