package jktest.test170117;

/**
 * @author feng.qian
 * @create at 2017-01-24 12:01
 *
Java 中共有三种变量：

本地变量
实例变量
类、静态变量
类变量，是归属类的变量，它是通过在定义类的属性的时，增加static修饰符，所以又称为静态变量。类变量不仅可以直接通过类名+点操作符+变量名来操作，也可以通过类的实例+点操作符+变量来操作，大多数情况下，采用前者操作方式，一来不能够有效地使用该变量，二来能够表示该变量就是类变量。

实例变量，是归属于类的实例的变量，又称为成员变量，没有经过static修饰。实例变量只能通过类名的实例+点操作符+变量来操作。

不管是类变量，还是实例变量，都可以设置Java的访问修饰符，若是需要公开操作，你可以在这些变量前面添加public访问权限；若是只限于所在类中操作，你可以在这些变量前面添加private访问权限。

局部变量就是在类中方法体里面所定义的变量，不管是方法的形参，还是方法体内所定义的变量都是局部变量。局部变量的作用域是以其所在方法体的头大括号开始到尾大括号结束。
 */


public class variabletest {
    public static void main(String[] args) {
        bendibianliang bdbl = new bendibianliang();
        bdbl.pupAge();



    }
}

/*
本地变量
    本地变量在方法、构造器或者块中声明
    本地变量在方法、构造器或者块进入时被创建，一旦退出该变量就会被摧毁
    可访问描述符不能用于本地变量
    本地变量仅在已经声明的方法、构造器或者块中可见
    本地变量在栈深度内部实施
    本地变量没有默认值，因此本地变量必须被声明并且在第一次使用前要给它赋值
*/
class bendibianliang{
    void pupAge(){
        int age = 0;  //本地变量没有默认值，因此本地变量必须被声明并且在第一次使用前要给它赋值
        //这里 如果没有初始化值  编译时会出现  .java:4:variable number might not have been initialized 错误
        age = age +7;
        System.out.println("pup age is :"+age);
    }
}

/*
实例变量
    实例变量在类中声明，但是它在方法、构造器或者块外。
    当堆中的对象被分配了一个空间时，每个实例变量的位置就被创建了。
    当对象采用关键字“ new ”创建时实例变量就被创建了，当对象被销毁时它也就被销毁了。
    实例变量的值必须被一个以上的方法、构造器或者块，或者类中必须出现的对象的状态的重要部分所引用。
    实例变量可以在类水平上在使用前或者使用后声明。
    实例变量可以用可访问描述符。
    实例变量对类中的所有方法、构造器或者块可见。一般来讲，推荐将这些变量私有（访问层面）。然而子类的可见性可用可访问描述符给予那些变量。
    实例变量有默认值。数字的默认值为零，布尔型默认值为假，对象引用默认值为空。在声明或者构造器内可以进行赋值。
    实例变量可以采用直接在类中叫名字方式访问。然而在静态方法和不同的类（实例变量可以被访问）中应当使用完全限定名称。ObjectReference.VariableName
*/
class shilibianliang{
    public String name;
    private double salary;

    public shilibianliang(String empName){
        name = empName;
    }

    public  void setSalary(double empSal){
        salary = empSal;
    }


}
/*
类、静态变量
    类变量也叫静态变量，它是在类中用 static 关键字声明的，但是它在方法、构造器或者块之外。
    每个类中只有一个类变量，不管这个类有多少对象。
    除了作为常量被声明之外，类变量很少被应用。常量是被作为 public、private, final 和 static 被声明的变量。实例变量的初始值不    会被改变。
    静态变量存储在静态内存中，很少采用静态变量而不是声明结束或者用常量public 或 private 之一。
    静态变量随着程序的开始和结束而开始和结束。
    可见性和实例变量相似。然而大多数静态变量被声明为public由于他们必须为类的使用者所用。
    默认值和实例变量相似。对于数字的默认值为零，布尔型默认值为假，对象引用默认值为空。在声明或者构造器内可以进行赋值。除此之外，      可以在特殊的静态初始化区赋值。
    静态变量可以用类的名称访问。ClassName.VariableName
    当静态变量被作为 public static final 声明时，变量（常量）名称都要用大写字母。如果静态变量不是 public 和 final，它的命名       方法和实例变量和本地变量相同。
*/
