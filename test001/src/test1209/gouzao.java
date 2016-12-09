package test1209;

/**
 * gouzaofangfa test
 *
 * @author feng.qian
 * @create at 2016-12-09 18:00
 */

class gz{
    private int a;private String b;

    public void setB(String b) {
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public int getA() {
        return a;
    }

    public gz(){}; //构造一个无参的
    public gz(int a,String b){ //构造一个多个参数的
        this.a=a;
        this.b=b;
    }
    public void print(){
    System.out.println(a+""+b);}
}

class gz2 extends gz{

}



public class gouzao {
    public static void main(String[] args) {
        gz2 g =new gz2();
        g.setA(10);
        g.setB("qf");
        g.print();
    }
}
