package wxy.test1223;

/**
 *
 *
 * throws
 *
 *
 * @author feng.qian
 * @create at 2016-12-23 14:19
 * 如果一个方法可以导致一个异常但不处理它，它必须指定这种行为以使方法的调用者可以保护它们自己而不发生异常。做到这点你可以在方法声明中包含一个throws子句。一个 throws 子句列举了一个方法可能抛出的所有异常类型。这对于除Error或RuntimeException及它们子类以外类型的所有异常是必要的。一个方法可以抛出的所有其他类型的异常必须在throws子句中声明。如果不这样做，将会导致编译错误。
 */


public class trycatchtest4 {
    // This is now correct.

        static void throwOne() throws IllegalAccessException {
            System.out.println("Inside throwOne.");
            throw new IllegalAccessException("demo");
        }
        public static void main(String args[]) {
            try {
                throwOne();
            } catch (IllegalAccessException e) {
                System.out.println("Caught >>" + e);
            }
        }
    }

