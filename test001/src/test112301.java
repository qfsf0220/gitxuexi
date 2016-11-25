/**
 * Created by feng.qian on 2016/11/23.
 */
class asd{
    int a = 10;
    private String name = "qfsf";

    public  void show(){
        System.out.println(a);
        System.out.println(name);
    }
}


public class test112301 {
    public  static void main(String[]args){
        asd ab = new asd();
        //System.out.println(ab.name);//這個是私有不能訪問
        System.out.println(ab.a);
        ab.show();
    }
}
