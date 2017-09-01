package YYlesson;

/**
 * Created by Administrator on 2017/9/1.
 */
class  aa{
    public void printaa(){
        System.out.println("123123");
    }
}

class aa2{
    public void printaa(aa x){
        x.printaa();
    }
}



public class 匿名Test {
    public static void main(String[] args) {
        //带名字调用
        aa a = new aa();
        a.printaa();
        a.printaa();
        //匿名 调用    适合调用一次的时候
        new aa().printaa();
        new aa().printaa();//这里重新创建了一个新的对象。 和上面的调用两次效果一样，性质不同。

        //匿名对象可以作为实参传递
        //普通写法
        aa2 aa2 = new aa2();
        aa a2 = new aa();
        aa2.printaa(a2);

        //匿名写法
        aa2.printaa(new aa());

        //全部匿名
        new aa2().printaa( new aa());

    }
}
