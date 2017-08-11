package wxy.sumscop20170811;

/**
 * Created by Administrator on 2017/8/11.
 */
//static 内部类相当于其外部类的 static 成员，它的对象与外部类对象间不存在依赖关系，因此可直接创建。
public class StaticInnerClass {
    public static void main(String[]a){
        Outer.Inner inner = new Outer.Inner();
        inner.dosome();
    }
}


class Outer {
    private  static int size;
    static class Inner {
        public void dosome(){
            size++;
            System.out.println("size:"+size);
        }
    }
}