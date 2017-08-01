package dongli.test170727.test20170731;

/**
 * Created by Administrator on 2017/8/1.
 */
public class ConstructionTest {
    public static void main(String[]a){
        aa aa= new aa();
        System.out.println(aa.getA());
        System.out.println(aa.getB());
        aa aa2=new aa(123,"qqq");
        System.out.println(aa2.getA());
        System.out.println(aa2.getB());

    }

}

class aa{

    private int a ;
    private String b;
    public aa(){}
    public aa(int a,String b){
        this.a=a;
        this.b=b;
    }

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

}
