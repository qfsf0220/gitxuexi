package test1222;

/**
 * @author feng.qian
 * @create at 2016-12-22 14:13
 *
 * 某些情况，由单个代码段可能引起多个异常。处理这种情况，你可以定义两个或更多的catch子句，每个子句捕获一种类型的异常。当异常被引发时，每一个catch子句被依次检查，第一个匹配异常类型的子句执行。当一个catch语句执行以后，其他的子句被旁路，执行从try/catch块以后的代码开始继续。
 */


// Demonstrate multiple catch statements.
class trycatchtwice {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = { 1 };
            c[42] = 99;
        } catch(ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob: " + e);
        }
        System.out.println("After try/catch blocks.");
    }

}

/*
该程序在没有命令行参数的起始条件下运行导致被零除异常，因为a为0。如果你提供一个命令行参数，它将幸免于难，把a设成大于零的数值。但是它将导致ArrayIndexOutOf BoundsException异常，因为整型数组c的长度为1，而程序试图给c[42]赋值。

*/