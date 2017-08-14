package wxy.sumsco20170814;

/**
 *                          抽象类和接口的主要区别。
 抽象类可以为部分方法提供实现，避免了在子类中重复实现这些方法，提高了代码的可重用性，这是抽象类的优势；而接口中只能包含抽象方法，不能包含任何实现。
 */
public abstract class A {
    public abstract void method1();
    public void method2(){}
}

class B extends A{
    public void method1(){

    }
}

class C extends A{
    public void method1(){

    }
}


