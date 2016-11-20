/**
 * Created by qfsf on 2016/11/20.
 * 二维数组求和 、 杨辉三角
 * 1
 * 11
 * 121
 * 1331
 * 14641
 * 15101051
 *
 *
 */
import  java.util.Scanner;
public class arraytest2 {
    public  static  void main(String [] args){
       int[][]arr = {{22,33,44},{55,66,77},{12,34,56},{78,97,23}} ;
        int sum = 0 ;

        for (int a=0;a<arr.length;a++){
            for (int b=0;b<arr[a].length;b++){
                sum+=arr[a][b];
            }
        }
        //杨辉三角 大概思路就是定义一个二维数组 数值按照它的规律填进去 然后打印
        System.out.println(sum);
        Scanner in = new Scanner(System.in);
        System.out.println("enter a num:");
        int n = in.nextInt();
        //定义一个二维数组
        int [][] arr2 = new int[n][n];
        // 这个数组的第一行 和最后一行都是1；
        for (int x=0;x<arr2.length;x++){
            arr2[x][0]=1;
            arr2[x][x]=1;
        }
        //第三行开始，每个数据是它上一行的前一列和上一行的本列只和
        for (int x=2;x<arr2.length;x++){   //x=2 就是第三列开始 给第三个数开始赋值
            for (int y=1;y<=x-1;y++){  //y=1 就是第二列开始 应为第一列有1  x-1就是倒数第二列 因为最后一列也有1
                arr2[x][y]=arr2[x-1][y-1]+arr2[x-1][y];//每一个数 = 上行的前一列 +上行的本列。。
            }
        }



        //遍历这个二维数组
        for(int x =0;x<arr2.length;x++){
            for (int y=0;y<=x;y++){    //这里的j<=i 是因为 会把对角线对应的数值打印出来 不需要打印 所以这样的逻辑
                System.out.print(arr2[x][y]+"\t");
            }
            System.out.println();


        }







    }
}
