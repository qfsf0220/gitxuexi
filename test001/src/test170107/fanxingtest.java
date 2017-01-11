package test170107;

/**
 * Created by qf on 2017/1/7.
 *
 * 使用 class 名称 <泛型列表> 声明一个类  为了 和普通的类有所区别 这样的类成为泛型类
 * class ShowObj<E>
 *
 * 其中 Showobj 是泛型类名称  E是泛型 ，E可以是 对象或接口，但是不能是基本类型数据
 */
public class fanxingtest {
    public static void main(String []args){
        ShowObject<Dog> showdog = new ShowObject<Dog>(); //后面的dog可以省略
        ShowObject<Cat> showcat = new ShowObject<>();

        showcat.showMess(new Cat());
        showdog.showMess(new Dog());

    }
}

class Cat{
    @Override
    public String toString() {//泛型变量只能调用toString()方法
        return "this is a cat";
    }
}

class Dog{
    @Override
    public String toString() {
        return "this is a dog";
    }
}

class ShowObject<E>{
    public void  showMess(E e){
        System.out.println(e.toString());
    }
}