package test1221.trytest;

/**
 * @author feng.qian
 * @create at 2016-12-21 11:15
 * Java异常处理通过5个关键字控制：try、catch、throw、throws和 finally。
 * 程序声明了你想要的异常监控包含在一个try块中。如果在try块中发生异常，它被抛出。你的代码可以捕捉这个异常（用catch）并且用某种合理的方法处理该异常。系统产生的异常被Java运行时系统自动抛出。手动抛出一个异常，用关键字throw。任何被抛出方法的异常都必须通过throws子句定义。任何在方法返回前绝对被执行的代码被放置在finally块中。

所有异常类型都是内置类Throwable的子类。因此，Throwable在异常类层次结构的顶层。紧接着Throwable下面的是两个把异常分成两个不同分支的子类。一个分支是Exception。

该类用于用户程序可能捕捉的异常情况。它也是你可以用来创建你自己用户异常类型子类的类。在Exception分支中有一个重要子类RuntimeException。该类型的异常自动为你所编写的程序定义并且包括被零除和非法数组索引这样的错误。

另一类分支由Error作为顶层，Error定义了在通常环境下不希望被程序捕获的异常。Error类型的异常用于Java运行时系统来显示与运行时系统本身有关的错误。堆栈溢出是这种错误的一例。本章将不讨论关于Error类型的异常处理，因为它们通常是灾难性的致命错误，不是你的程序可以控制的。
 */


public class trycatch {
    public static void main(String[] args) {
        try{
        trycatch.err0();
            System.out.println("这里不会输出到");//一旦异常被引发，程序控制由try块转到catch块。执行永远不会从catch块“返回”到try块。
        }catch (ArithmeticException e){

            System.out.println( "报错了 错误是："+e);
        }
    }

    static void err0(){
        int d = 0;
        int a =55/d;
        System.out.println(a);
    }

}
