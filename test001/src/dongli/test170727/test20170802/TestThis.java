package dongli.test170727.test20170802;

/**
 * Created by Administrator on 2017/8/2.
 */
public class TestThis {
    public static void main(String[]a){
        TestThis.StaticA();
        TestThis t = new TestThis();
        t.setName("sdfsdrfw3");

}

    int id ;
    String name;
    //实例方法
    public void setId(int id ){
        this.id=id;
        this.name="qqwe";
        System.out.println("setId run");
    }
    //实例方法
    public void setName(String aaa){
        this.setId(123);
        System.out.println("setName run");
    }
    //类方法
    static public void StaticA(){
        System.out.println("staticA run");
    }

}
