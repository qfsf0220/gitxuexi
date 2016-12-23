package wxy.test1223;

/**
 * Created by qfsf on 2016/12/23.
 */
class man extends person{
    @Override
    void showmsg() {
        System.out.println("男子身高："+height);
    }

    void dospeak(){
        System.out.println(" man speaking.");
    }
}

class woman extends person{
    @Override
    void showmsg() {
        System.out.println("女子身高:"+height);
    }

    void dospeak(){
        System.out.println("woman   speaking...");
    }
}

class person{
    int height;

    void showmsg(){
        System.out.println(" your message.");
    }
    void  dosth(){
        System.out.println("eating..");
    }
}

public class shangzhuanxing {
    public static void main(String[] args) {
        person p = new man();// p 成为 man生成对象的上转型对象

        person p2 ;
        man m =new man();
        p2= m;
        System.out.println("---------");
        person pp = null;//首先需要引用父对象

        man qqqq = new man();
        pp = qqqq; //qqqq上转型为 person
        pp.height=177;
        pp.showmsg();
        pp.dosth(); //父类定义  子类继承  上转型对象 可以 操作继承或重写的方法
        // pp.dospeak(); 这个是子类新增的 父对象 没权限调用。

        woman ssss = new woman();
        pp = ssss;
        pp.height=160;
        pp.showmsg();
        pp.dosth();
        //pp.dospeak(); 同上错误。

        ssss= (woman) pp;//如果强制将上转型对象转换为一个子类对象,这时 改子类对象又具备了子类的所有属性和功能。
        // 由于 pp（person）类可能不止woman一个子类 所以要通过（子类）父类 这个格式，这时sss子类又能操作其子类的变量
        ssss.dospeak();//这里可以正常调用其子类方法



    }
}


//注意  上转型对象  只能操作  继承或隐藏的变量   and 继承或重写的方法   不能 操作 新增的变量  和新增的方法

//而一般对象 还可以操作 新增的变量  和新增的方法