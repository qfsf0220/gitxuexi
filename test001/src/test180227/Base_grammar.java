package test180227;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/2/27.
 */
public class Base_grammar {
    public static void main(String[] args) {
        Base_grammar bg = new Base_grammar();
            bg.sswitchcase();
            bg.wwhile();
            bg.sum();
            bg.ffor();

        bg.bbreak();
        bg.ccontinue();
        bg.fffor();
        bg.jiweishu(222);
        bg.addscore();
        bg.aarray();
        bg.getMax();
        bg.getMaxAge(87,87,88,93);
    }


    private   void sswitchcase(){
        char today = '德';
        switch (today) {
            case '一':
            case '三':
            case '五':
                System.out.println("馒头");
                break;
            case '二':
            case '四':
            case '六':
                System.out.println("大饼");
                break;
            default:
                System.out.println("意面");
        }
    }

    void wwhile(){
        int i = 1;
        while (i<4){
            System.out.println(i);
            i++;
        }
    }

    void sum(){
        int a = 2;
        int b = 2;
        do {
            a = a + 2;
            b = a+b;
        } while (a < 50);
        System.out.println("1-50 偶数和是："+b);
    }

    void ffor(){
        int sum = 0;
        for (int i=1 ;i<5;i++){
            sum += i;
        }
        System.out.println("sum is :"+sum);
    }
    void bbreak(){
        System.out.println("break");
        for(int i=1;i<5;i++){
            System.out.println(i);
            if (i ==3){
                break;
            }
        }
    }

    void ccontinue(){
        System.out.println("continue");
        for (int i =1; i<5;i++){

            if (i==3){
                continue;
            }
            System.out.println(i);
        }
    }
    void fffor(){
        for (int i =1;i<5;i++){
            for (int k=4;k>i;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void jiweishu(int yournumber){
        int count =0;
        if (yournumber >=0 && yournumber < 99999999){
            while ( yournumber !=0){
            count++;
            yournumber /= 10;}
        }
        System.out.println(count + "位数");
    }
    void addscore(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you score:");
        int myscore = input.nextInt();
        int count=0;
        while (myscore<100){
            myscore++;
            count += 1;
        }
        System.out.println("New score:"+myscore+", up "+count);
    }

    void aarray(){
        //声明数组
        int []a ;//里面都是整数的 列表
        double[] b; //里面都是浮点数的列表
        //分配空间
        a = new int[5];//分配空间为5的 整数数组
        b= new double[5];//分配空间为5的 小数数组
        //直接定义
        int []c = new int[5];
        //赋值
        b[0]=1;
        b[2] = 33;
        //直接声明 分配 赋值
        int[]d = new int[] {1,2,3};
        //或者
        int[] e = {1, 2, 3, 4};
        for(int i :a){
            System.out.println(i);
        }
        System.out.println("******");
        for(int i :d){
            System.out.println(i);
        }
    }

    void getMax(){
        int[] intarray = {2,5,3213,45,23,123, 4, 5, 6, 8};
        int max = intarray[0];
        for(int i=0;i<intarray.length;i++){
            if(intarray[i]>max){
                max = intarray[i];
            }
        }
        System.out.println("the max is :"+max);
    }

    void getMaxAge(int yangzong,int zhangzong,int dange,int xiaohuozi){
        int[] ages = {yangzong, zhangzong, dange, xiaohuozi};
        int max = xiaohuozi;
        for (int i :ages){
            if (i < max)
            max = i;
        }
        System.out.println("max:"+max);
    }



}
