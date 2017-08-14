package wxy.sumsco20170814;

/**
                    抽象类和接口的主要区别。
 抽象类可以为部分方法提供实现，避免了在子类中重复实现这些方法，提高了代码的可重用性，这是抽象类的优势；而接口中只能包含抽象方法，不能包含任何实现。
 */
public interface D {
    public void method3();
    public void method4();
//    public void method5(){ //接口不能包含方法
//
//    }
}

class E implements D{
    public  void method3(){

    }
    public void method4(){

    }
}

class F implements D{
    public void method3(){

    }
    public  void method4(){

    }
}

