import java.util.Scanner;
/**
 * Created by mac on 16/11/18.
 */
class test1118 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        //单独调用（不推荐）
        sumsum(x, y);
        //输出调用
        System.out.println(sumsum(x, y));
        //赋值调用 （推荐）
        int aa = sumsum(x, y);
        //对于调用结果aa 可以进行其他操作。
        System.out.println(aa);

        Scanner in = new Scanner(System.in);
        System.out.println("enter a number 1:");
        int m = in.nextInt();
        System.out.println("enter a number 2:");
        int n = in.nextInt();

        int c = getMax(m, n);
        System.out.printf("the max is %d\n", c);
        int d = getMax2(m, n);
        System.out.printf("\tthe max is %d\n", d);

        boolean fff = compare(m,n);
        if (fff ==true){System.out.println("==");}
        else{System.out.println("!=");}

        boolean ff2 = compare2(m,n);
        System.out.println(ff2);

    }

    /**
     * 求和,返回值类型 int  参数列表  2个 都是int
     **/
    public static int sumsum(int a, int b) {
        return a + b;
    }

    //输入两个数据，返回较大值
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //三元方法
    public static int getMax2(int a, int b) {
        int c = a > b ? a : b;  //int c =((a>b)? a:b);
        return c;
        //或者  直接  return ((a>b)? a:b);
    }

    //判断两个数值是否相等，（结果应该是个boolean类型值）
    public static boolean compare(int a ,int b){
        if(a==b) {
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean compare2(int a ,int b){
        return (a==b)? true:false;
    }

}