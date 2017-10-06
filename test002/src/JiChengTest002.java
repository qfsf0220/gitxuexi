/**
 * Created by qfsf on 2017/10/6.
 */
public class JiChengTest002 {
    public static void main(String[] args) {
        classSub  cs = new classSub();

        System.out.println("--------");
        CSub cs2 = new CSub();

    }
}

class classSuper{
    classSuper(){
        System.out.println("this is super class");
    }
}


class classSub extends classSuper{
    classSub(){
//        System.out.print("this is transfer super class");
//        super();
        System.out.println("this is sub class");
    }
}

//对于无参构造函数  子类自动调用。不需要super();《super() 需要放在构造函数最前面》。有参则必须用super(参数).
class CSuper{
    CSuper(){
//        super();
        System.out.println("this is CSuper constructor.");
    }
    CSuper(String a){
        System.out.println("this is CSuper constructor.(have a string args)");
    }
}

class CSub extends CSuper{
    CSub(){
        super("xxx");
        System.out.println("this is CSub constructor");
    }
}

