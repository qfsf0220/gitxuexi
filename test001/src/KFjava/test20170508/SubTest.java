package KFjava.test20170508;

/**
 * Created by Administrator on 2017/5/8.
 */
class Base{
    public double a;
    public double b;

    public  Base(double a,double b){
        this.a=a;
        this.b=b;
    }
}


public class SubTest extends Base {
    public String c;
    public SubTest(double a,double b,String c){
        super(a,b);
        this.c=c;
    }
    public  static  void main(String[]args){
        SubTest st = new SubTest(5.5,6.6,"234");
        System.out.println(st.a+"  "+st.b+"  "+st.c);
    }
}
