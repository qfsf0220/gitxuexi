package wxy.sumscop20170811;

/**
 * Created by Administrator on 2017/8/11.
 */
public class OuterClassTest {
    private int size;
    public class Inner{
        private int counter = 10;
        public void dosome(){
            size++;
        }
    }

    public static void main(String[]a){
        OuterClassTest  oc = new OuterClassTest();
        Inner inner  = oc.new Inner();
        inner.dosome();
        System.out.println(oc.size);
        System.out.println(inner.counter);
        //System.out.println(counter);//这里编译错误，外部类无法访问内部类的变量。

        }
    }

