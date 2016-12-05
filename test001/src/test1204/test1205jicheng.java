package test1204;

/**
 * 继承test
 *
 * @author feng.qian
 * @create at 2016-12-05 15:28
 */

class test0501{
    private int a ;
    int b = 2;
    protected int c =3;
    public int d = 4;

    public void setA(int a) {this.a = a;}
    public int getA() {return a;}
}

public class test1205jicheng {
    public static void main(String[] args) {
        test0501 a = new test0501();
        a.setA(1);
        System.out.println(a.b+a.getA()+a.c+a.d);


        //这个test05是test1204这个package里面的 test1205下面的 class test05
        test05 a2 = new test05();
        a2.setName("qf");
        System.out.println(a2.getName());



    }
}
