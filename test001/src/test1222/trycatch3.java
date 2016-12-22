package test1222;

/**
 * @author feng.qian
 * @create at 2016-12-22 14:29
 */


public class trycatch3 {
    public static void main(String[] args) {
           try {
               int a = 0;
               int b = 42 / a;
           } catch(Exception e) {
               System.out.println("Generic Exception catch.");
           }

          //这里注释掉因为 catch(ArithmeticException e) { // ERROR - unreachable
           //当你用多catch语句时，记住异常子类必须在它们任何父类之前使用是很重要的。这是因为运用父类的catch语句将捕获该类型及其所有子类类型的异常。这样，如果子类在父类后面，子类将永远不会到达。而且，Java中不能到达的代码是一个错误
               System.out.println("This is never reached.");
           }
       }

