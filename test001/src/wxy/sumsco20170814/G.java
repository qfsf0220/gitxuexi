package wxy.sumsco20170814;

/**
 接口和抽象类各有优缺点，在接口和抽象类的选择上，必须遵守这样一个原则：
 行为模型应该总是通过接口而不是抽象类定义，所以通常是优先选用接口，尽量少用抽象类。
 选择抽象类的时候通常是如下情况：需要定义子类的行为，又要为子类提供通用的功能。
 */
interface G {
    public void method5();
}
interface H{
    public void method6();
}
class I  implements G,H{
    public void method5(){

    }
    public void method6(){

    }
    G g = new I();
    H h = new I();
}


abstract class J {
    public abstract void method5();
}
abstract class K extends J{
    public  abstract void method6();
}

class L extends  K{
    public void method5(){

    }
    public void method6(){

    }
}
