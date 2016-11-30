/**
 * learning 8th javawanquanshouce
 *
 * @author feng.qian
 * @create at 2016-11-30 15:16
 */
//method overloading
class Overloaddemo{
    void test(){
        System.out.println("no parameters");
    }
    void test(int a){
        System.out.println("a:"+a);
    }
    void test(int a ,int b){
        System.out.println("a:"+a+" b:"+b);
    }
    double test(double a){
        System.out.println("double a:"+a);
        return a*a;
    }

}


public class classreloadtest1130 {
    public static void main(String[] args) {
        Overloaddemo o = new Overloaddemo();
        double result;

        o.test();
        o.test(10);
        o.test(10,20);
        result = o.test(10.5);
        System.out.println("o.test(10.5):"+result);
        o.test(15.5);
    }
}
