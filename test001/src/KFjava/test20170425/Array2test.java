package KFjava.test20170425;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/4/25.
 */
public class Array2test {
    public static void main(String[]args){
        int[]a =new int[]{1,2,3,32,4,456,657};
        int []b={5,6,7,2,8,3};
        int []c = Arrays.copyOf(a,10);
        System.out.println("a 和c 是否相等:"+Arrays.equals(a,c));
        int[][]d ={{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(b));
        Arrays.sort(c); //这里是排序 操作返回为void 无法println
        System.out.println("排序以后的c元素为:"+Arrays.toString(c));
        Arrays.fill(a,2,4,1);//这里是赋值操作 把a数组的2到4元素赋值为1 返回为void 无法println

    }
}
