/**
 * Created by qfsf on 2016/11/20.
 *
 * 二位数组的遍历
 */
public class Array2test {
    public static void  main(String[] args){
        int [][] arr ={{1,2,3},{4,5,6},{7,8,9}};
//        System.out.print(arr[0]);


        for (int i=0;i<arr[0].length;i++){
            System.out.print(arr[0][i]);
        }
        System.out.println();
        for (int i=0;i<arr[1].length;i++){
            System.out.print(arr[1][i]);
        }
        System.out.println();

        for (int i=0;i<arr[2].length;i++){
            System.out.print(arr[2][i]);
        }
        System.out.println();
        System.out.println("--------------------");
        //循环方法
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("--------------------");
        printarr22(arr); //调用方法




    }
    /*
    * 方法的 方式
    * 范围值类型 为输出形式 所以是 void
    * 参数列表  是一个 二维数组
    *
    * */
    public  static void printarr22(int[][] arrabc){
        for (int i=0;i<arrabc.length;i++){
            for (int j=0;j<arrabc[i].length;j++){
                System.out.print(arrabc[i][j]);
            }
            System.out.println();
        }
    }

}
