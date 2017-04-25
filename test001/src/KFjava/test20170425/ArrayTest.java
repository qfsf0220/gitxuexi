package KFjava.test20170425;

/**
 * Created by Administrator on 2017/4/25.
 */
public class ArrayTest {
    public static void main (String[] args ) {
        int[] intArr = new int[]{1, 2, 3, 4, 32, 532423423};
        String[] strArr = new String[]{",sfsdf", "史蒂夫"};
        Object[] objArr = new Object[]{"sdf s", "史蒂夫"};
        Object[] objArr2 = new String[]{"asd", "asd"}; //这里 String类 是 Object的子类
        int[] a = {123234, 34, 5, 345,};//静态初始化 简化写法
        int[]b=new int[5]; //动态初始化
        Object[]x=new String[3];
        x[2]="adfsdf"; //给上面初始化的数组 的第三个空间 赋值
        System.out.println(x[2]);
        System.out.println(a[1]);
        for (int i =0;i<intArr.length;i++){
            System.out.println(intArr[i]);
        }
        System.out.println("--------------");
        for (int i =0;i<5;i++){
            b[i]=i;
        }//这里给array b 赋值

        for (int i :b){ //通过foreach 打印  foreach 无法修改值
            System.out.println(i);
        }
        System.out.println("==========");
        int [][]arrAA= new int [5] [5] ;
        arrAA[0][1]=2;
        arrAA[0][2]=33;
        System.out.println("arrAA - length:"+arrAA.length);
        for (int i =0;i <arrAA.length;i++){
            for (int j=0 ;j<arrAA[i].length;j++){
                System.out.println(arrAA[i][j]);
            }

        }


    }
}
