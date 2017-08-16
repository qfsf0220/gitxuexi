package heima.test0816;

/**
 * Created by Administrator on 2017/8/16.
 */
public class TryCatchTest003 {
    public static void main(String[]a){
        Demo816003 d= new Demo816003();
        try{
            int x =d.div(11,0);
            System.out.println("x:"+x);
        }catch (ArithmeticException e) {  //实例中声明了多少错误，需要捕获几个错误。
            System.out.println(e.toString());
            System.out.println("零除错误");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
            System.out.println("角标越界");
        }catch(Exception e){
            e.printStackTrace(); //这里 如果多个catch块中异常出现继承关系 ，父类Exception 需要放最下面
        }
        System.out.println("end.");
    }
}
//这里针对性的对多个错误进行捕获，比直接用Exception更好一些。
class Demo816003{
    int div(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{
        int[] abc = new int[a];
        System.out.println( abc[9]); // 这里输出数组第9个数，如果实参带入小于9就是ArrayIndexOutOf..
        //上面这个println发生错误。会catch到错误 然后退出，所以return a/b 这里不会运行到。
        return a/b;  //这里 b为0 就是零除错误。
    }
}
