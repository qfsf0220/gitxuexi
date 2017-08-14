package wxy.sumscop20170811;

public class InterfaceUsedbyObj {
    public  void test1(A a){
        a.dosome();
    }
    public static void main(String[]a){
        InterfaceUsedbyObj ii = new InterfaceUsedbyObj();
        A aa = new B();
        ii.test1(aa);
    }
}

interface A {
    public int dosome();
}
class B implements  A{
    public  int dosome(){
        System.out.println(" this is class B");
        return 668;
    }
}