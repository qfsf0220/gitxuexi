/**
 * Created by qfsf on 2016/11/20.
 *
 *匿名对象只调用一次  适合只调用一次的时候  调用后就能被内存回收
 * 匿名对象可以作为参数传递
 *
 * 调用方法
 * new className().方法名()
 *
 */
class student2 {
    public void say(){
        System.out.println("i m a student");
    }
}

class studentdemo2 {
    public  void show(student2 s){
        s.say();
    }
}


public class lambdaclass {
    public static void main(String [] args){
      //普通调用/
        student2 s = new student2();
        s.say();
        //匿名对象调用
        new student2().say();
        new student2().say();//这里再调用了一次等于重新创建了一个新的对象。熬用多次就不合适了。


       // 匿名对象作为实例参数传递
        studentdemo2 sd = new studentdemo2();
        student2 s2 = new student2();
        sd.show(s2); //常规调用
        sd.show(new student2());

        //更全面的匿名

        new studentdemo2().show(new student2());
        //先调用 studentdemo2 .它的show方法 中匿名 引用 student2 类

    }
}

