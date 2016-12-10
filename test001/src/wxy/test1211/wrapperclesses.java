package wxy.test1211;

import java.util.InputMismatchException;

/**
 基本数据类型 	对应的包装类
 byte 	        Byte
 short 	        Short
 int 	        Integer
 long 	        Long
 char 	        Character
 float      	Float
 double     	Double
 boolean    	Boolean
 每个包装类的对象可以封装一个相应的基本类型的数据，并提供了其它一些有用的方法。包装类对象一经创建，其内容（所封装的基本类型数据值）不可改变。

 基本类型和对应的包装类可以相互装换：

 由基本类型向对应的包装类转换称为装箱，例如把 int 包装成 Integer 类的对象；
 包装类向对应的基本类型转换称为拆箱，例如把 Integer 类的对象重新简化为 int。

 */
//简单例子实现int 和 Integer 的互相转换
class wrapperclesses {
    public static void main(String[] args) {
        int m = 500;
        Integer obj = new Integer(m);  // 手动装箱
        int n = obj.intValue();  // 手动拆箱
        System.out.println("n = " + n);

        Integer obj1 = new Integer(500);
        System.out.println("obj 等价于 obj1？" + obj.equals(obj1));

        System.out.println("---------------");
        //运行Dae
        Dae d = new Dae();
        d.demo();
    }
}

class Dae{
    void demo(){
        String [] str={"123","123abc","abc123","cdefg"};
        for (String i:str){
            try{
                int m= Integer.parseInt(i,10);
                System.out.println(i+"可以转换为整数"+m);
            }catch (Exception e){
                System.out.println(i+"无法转换为整数");
            }
        }
    }
}