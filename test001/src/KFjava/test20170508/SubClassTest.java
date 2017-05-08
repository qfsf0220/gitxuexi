package KFjava.test20170508;

/**
 * Created by Administrator on 2017/5/8.
 */
  class BaseClassTest{
    public int book=6;
    public void base (){
        System.out.println("父类的普通方法");
    }
    public void test(){
        System.out.println("父类被覆盖的方法");
    }
}

public class SubClassTest extends BaseClassTest {
    public  String book = "666";
    public void test(){
        System.out.println("子类的覆盖父类的方法");
    }
    public void subb(){
        System.out.println("子类的普通方法");
    }

      public static void main(String []args){
        BaseClassTest bct = new BaseClassTest();
          System.out.println(bct.book);
          bct.base();
          bct.test();

          SubClassTest sct = new SubClassTest();
          System.out.println(sct.book);
          sct.base();
          sct.test();

          BaseClassTest polymophic = new SubClassTest();
          System.out.println(polymophic.book);
          polymophic.base();
          polymophic.test();
//          polymophic.sub(); //这里polymophic的编译类型是BaseclassTest 没有提
          //供sub()方法，所以编译不通过。
    }
}
