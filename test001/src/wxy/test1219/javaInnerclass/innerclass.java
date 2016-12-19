package wxy.test1219.javaInnerclass;

/**
 * 在 Java 中，允许在一个类（或方法、语句块）的内部定义另一个类，称为内部类(Inner Class)，有时也称为嵌套类(Nested Class)。
 *
 * @author feng.qian
 * @create at 2016-12-19 13:54
 */


public class innerclass {
    public static void main(String[] args) {

        for (aaa a :aaa.values()){
            System.out.println(a);
        }

        aaa a = aaa.bb;
        if(a == aaa.bb){
            System.out.println("yes bb");
        }

        //上面已经定义了a是 bb，所以case到 bb println bb
        switch (a){
            case aa:
                System.out.println("aa");
                break;
            case bb:
                System.out.println("bb");
                break;
            case dd:
                System.out.println("dd");
                break;
            default:
                System.out.println("cc");
        }
    }

    enum aaa{
        aa,bb,cc,dd
    }
}
