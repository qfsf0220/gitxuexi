package wxy.test1214.duotaileixindezhuanhuan;

/**
 * Java多态对象的类型转换
 *
 * @author feng.qian
 * @create at 2016-12-14 14:56
 *
 * 这里所说的对象类型转换，是指存在继承关系的对象，不是任意类型的对象。当对不存在继承关系的对象进行强制类型转换时，java 运行时将抛出 java.lang.ClassCastException 异常。
 * 在继承链中，我们将子类向父类转换称为“向上转型”，将父类向子类转换称为“向下转型”。
 *
 *
 */
class father{

}

class son extends  father{

}

public class duotaileixingzhuanhuan {
    public static void main(String[] args) {
        father f = new father();
        son s = new son();

        //下面抛错 不能将父类直接转成 子类类型
        //son  s2= (son)f;
        //需要先向上转型， 在向下转型
        f = s;
        son s2 = (son)f;





    }
}
