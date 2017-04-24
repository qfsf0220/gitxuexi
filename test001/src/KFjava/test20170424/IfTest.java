package KFjava.test20170424;

import wxy.test1212_usebaozhuanglei.StringToInt;

/**
 * Created by Administrator on 2017/4/24.
 */
public class IfTest {
    public static void main(String args []){
        int age = 31;
        if (age>20 && age<=30){
            System.out.println("青年.");}
        else if (age >30 && !(age >60))
            System.out.println("中年。");
        else if (age >60)
            System.out.println("old man");
        else { //这里的一对花括号可以省略
            System.out.println("小于20岁。");
        }
    }
}
