package test170107;

/**
 * Created by qf on 2017/1/7.
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
    public String toString() {
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