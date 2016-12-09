package test1208;

/**
 * test2
 *
 * @author feng.qian
 * @create at 2016-12-08 15:19
 */


public class test2 {
    public static void main(String[] args) {
//        System.out.println("");
//        int  [] []a = {{1,2},{3,4},{5,6}};
//        for (int i=0;i<a.length;i++){
//            for(int j =0;j<a[i].length;j++) {
//                System.out.println(a[i][j]);
//
//            }
//        }

        int []b={1,3,2,5,4};
        int temp=0;
        for (int i=0;i<b.length;i++){
            for (int j=i;j<b.length;j++){
                if(b[i]>b[j]){
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
                }
            }

        for(int a:b ){
            System.out.println(a);
        }
        }

    }

