package wxy.test1210;

/**
 public 	共有的，对所有类可见。
 protected 	受保护的，对同一包内的类和所有子类可见。
 private 	私有的，在同一类内可见。
 默认的 	在同一包内可见。默认不使用任何修饰符。
 */
class Dog{
    protected void bark(){
        System.out.println("汪汪汪");
    }
}

class Teddy extends Dog{
    public void bark(){ //被声明为protected的变量、方法和构造方法能被同一个包中的任何其他类访问，也能够被不同包中的子类访问。
        //protected访问修饰符不能修饰类和接口，方法和成员变量能够声明为protected，但是接口的成员变量和成员方法不能声明为protected。
        //
        System.out.println("汪汪汪 重载了");
    }
}


class fangwenkongzhi {
    public static void main(String[] args) {
        Teddy t = new Teddy();
        t.bark();
    }
}
