import java.math.*;
public class arrayarray {
 	public static void main(String[] args){
        int[] a = new int[100];
        for (int i =0;i<100;i++){
            a[i]=i;
        }
        System.out.println(a[3]);
        System.out.println("--------------");
        //初始化 数组
        int[] smallint = {1,2,3,4,5,6,6,7,8,9};
        for (int i = 0;i<smallint.length;i++){
            System.out.println(smallint[i]);
        }
        System.out.println("--------------");
        //匿名初始化
        //array111 = new int[] {11,12,13,14,16,24}; //like: int[] anonymous = {11,12,13,14,16,24};array111=anonymous;
        System.out.println("--------------");
        //test   33 chose 7 
        int[]  testarray = new int[33];
        for(int i=0;i<33;i++){
            testarray[i]=i+1;
        }
        System.out.println(testarray[30]);
        System.out.println(testarray[31]);
        System.out.println(testarray[32]);
        System.out.println(testarray[0]);
	}
 }
