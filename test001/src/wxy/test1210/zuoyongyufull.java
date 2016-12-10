package wxy.test1210;

/**
 类级变量在类定义后就已经存在，占用内存空间，可以通过类名来访问，不需要实例化。

 对象实例级变量就是成员变量，实例化后才会分配内存空间，才能访问。

 方法级变量就是在方法内部定义的变量，就是局部变量。

 块级变量就是定义在一个块内部的变量，变量的生存周期就是这个块，出了这个块就消失了，比如 if、for 语句的块。块是指由大括号包围的代码
 */




public class zuoyongyufull {
    public static String name = "qf";//这个是类级别变量 static关键字
    public int i;//对象实例变量 -- 没有static
    //属性块，在类初始化时候运行
    {
        int j = 2;//块级变量。
    }
    public void test1(){
        int j =3;//方法级变量
        if(j==3) {
            int k=5;//块级变量
        }
        //这里不能访问块级变量，块级变量只能在块内部访问
        System.out.println("name:"+name+",i:"+i+",j:"+j);

    }

    public static void main(String[] args) {
    //不创建对象，直接通过类名访问类级变量
        System.out.println(zuoyongyufull.name);
        //创建对象访问
        zuoyongyufull z= new zuoyongyufull();
        z.test1();

    }
}
