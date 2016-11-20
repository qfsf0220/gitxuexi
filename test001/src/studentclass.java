import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

/**
 * Created by qfsf on 2016/11/20.
 * 一个基本类  一个测试类
 * 测试类为文件名
 *
 * 创建对象：
 *  格式： 类名 对象名 = new 类名();
 *      使用 对象名.变量名
 *      对象名.方法名（...参数）
 */

 class Student{
    String name;
    int age;
    String address;
    public void study(){
        System.out.println("study study..");
    }
    public  void eat(String name){
        System.out.println(name+" want eat eat...");
    }
    public void sleep(){
        System.out.println("sleep sleep..");
    }
 }




 class studentclass {
     public  static void main(String [] args){
         Student  mys = new Student();
         System.out.printf("%s -- %d",mys.name,mys.age);
         //赋值
         mys.name="zhangzong";
         mys.age=30;
         System.out.printf("%s -- %d\n",mys.name,mys.age);
         mys.sleep();
         mys.eat(mys.name);

     }
 }

