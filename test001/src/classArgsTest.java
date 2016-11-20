/**
 * Created by qfsf on 2016/11/20.
 *
 *基本类型 形参的改变不影响实参
 *应用类型 形参的改变 影响实参
 */

//这个形参是基本类型
class demo{
    public int sum(int a ,int b){
        return a+b;
    }
}

//这个形参是引用类型
class student{
    int xxx = 123;
    public void show(){
        System.out.println("i am a student");
    }
}
class studentdemo{
    public void printshow(student s){ //引用student 变量 变量名 取名 s
        //**如果一个形参是一个类     这里其实是需要这个类的对象。（方法 属性）
        s.show();
        System.out.print(s.xxx);
    }
}



public class classArgsTest {
    public static void main(String [] args){
        //基本类型调用
        demo dd = new demo();
        int x = dd.sum(10,20);
        System.out.println(x);

        System.out.println("===========");
        //引用类型调用
        studentdemo sd = new studentdemo();
        //要调用student类  也要先把他实例化
        student ss =new student();

        sd.printshow(ss);


  }
}
