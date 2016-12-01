/**
 * 一个测试的内部类
 *
 * @author feng.qian
 * @create at 2016-12-01 18:20
 */
class outer{
    int outer_x = 100;

    void test(){
        inner inn = new inner();
        inn.display();
    }
    class inner{
        void display(){
            System.out.println("display:outer_x :"+outer_x);
        }
    }
}

public class Innerclasstest1201 {
    public static void main(String[] args) {
        outer out = new outer();
        out.test();
    }
}
