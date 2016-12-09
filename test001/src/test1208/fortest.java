package test1208;

import java.util.Scanner;
/**
 * test1
 *进制转换 10转成8 或 10转成16
 * @author feng.qian
 * @create at 2016-12-08 13:27
 */



class A{
    int age;
    String  name;
    A(int age ,String name){
        this.age=age;
        this.name=name;
//        System.out.println(age+name);
    }
}

public class fortest {
    public static void main(String[] args) {
        A a = new A(11,"qq");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入转换的进制数8or16：");
        int num1 = sc.nextInt();
        System.out.println("num1"+num1);
        if (num1 == 8){
            System.out.println("准备转成8进制");
        }
        else if(num1==16){
            System.out.println("准备转成16进制");
        }
        else{
            System.out.println("输入的不是8或者16");
        }
        Scanner sc2= new Scanner(System.in);
        System.out.println("输入需要转换的数字");
        int numuse = sc2.nextInt();

        int ab2 =8;

        int yu = numuse%ab2;
        int shang = numuse/ab2;
        if (num1 ==8 && shang <8 ){
            System.out.println(shang+""+yu);
        }else {
            int shang2 = shang/8;
            int yu2 = shang%8;
            System.out.println(shang2+""+yu2+""+yu);
        }


    }
}
