package wxy.test1210;

/**
 用法1.this 关键字用来表示当前对象本身，或当前类的一个实例，通过 this 可以调用本对象的所有方法和属性
 用法2、成员变量与方法内部的变量重名时，希望在方法内部调用成员变量，这时候只能使用this
 用法3.。 作为方法名来初始化对象 也就是相当于调用本类的其它构造方法，它必须作为构造方法的第一句
 用法4  作为参数传递 需要在某些完全分离的类中调用一个方法，并将当前对象的一个引用作为参数传递时
 */
class Demo{
    public int x= 5;
    public int y =10;

    public void sum(){
        // 通过 this 点取成员变量
        int z = this.x+this.y; //obj 是 Demo 类的一个实例，this 与 obj 等价，执行 int z = this.x + this.y;，就相当于执行 int z = obj.x + obj.y;。
        System.out.println("z:"+z);
    }
}

class Demo2{
    public int age =20;
    public String name = "qf";

    Demo2(String name,int age){  //这里构造方法给两个参数 名字相同所以就要使用this
        this.age=age;
        this.name=name;
    }

    public void say(){
        System.out.println("name:"+this.name+ "  age:"+ this.age);
    }
}

class Demo3{
    public String name;
    public  int age;
    public Demo3(){
        this.name= "qf";
        this.age = 3;
        //也可以  name=qf;age=3; 或者this("qf",3)
    }
    public Demo3(String name ,int age){
        this.name=name;
        this.age=age;
    }
    public void say(){
        System.out.println("我是"+name+"  我几岁？"+age);
    }
}



class A{
    public  A(){
        new B(this).print();//匿名对象
    }
    public void print(){
        System.out.println("hello form A");
    }
}
class B{
    A a;
    public  B(A a){ //匿名对象就是没有名字的对象。如果对象只使用一次，就可以作为匿名对象，代码中 new B(this).print(); 等价于 ( new B(this) ).print();，先通过 new B(this) 创建一个没有名字的对象，再调用它的方法。
        this.a= a;
    }
    public void print(){
        a.print();
        System.out.println("hello form B");
    }
}



public class useThis {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.sum();

        //形参的作用域是整个方法体，是局部变量。在Demo2()中，形参和成员变量重名，如果不使用this，访问到的就是局部变量name和age，而不是成员变量。在 say() 中，我们没有使用 this，因为成员变量的作用域是整个实例，当然也可以加上 this

        Demo2 obj2 = new Demo2("sf",20);
        obj2.say();
        //Java 默认将所有成员变量和成员方法与 this 关联在一起，因此使用 this 在某些情况下是多余的。

        Demo3 obj3 = new Demo3();
        obj3 .say();

    }
}
