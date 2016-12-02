/**
 * 继承 使用 extends 关键字 将类的定义集成到另外一个类中
 *
 * @author feng.qian
 * @create at 2016-12-02 11:33
 */



        class A{
            int i,j;

            void showij(){
                System.out.println("i:"+i+" j:"+j);
            }
        }

        class B extends A{
            int k ;
            void  showk(){
                System.out.println("k:"+k);
            }

            void sum(){
                System.out.println("sum:"+(i+j+k));
            }
        }
public class jichengtest1202 {
    public static void main(String[] args) {
        A aaa= new A();
        B bbb = new B();

        aaa.showij();

        aaa.i=7;  //*
        bbb.j=8;
        bbb.k=9;


        bbb.showij();

        bbb.showk();

        bbb.sum();

    }
}