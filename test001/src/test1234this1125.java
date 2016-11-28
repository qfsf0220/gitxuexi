/**
 * Created by feng.qian on 2016/11/25.
 */
class test{
    private String name;
    private int age;

    public String getName(){
        return name; //這裡的name就是this.name
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
}

public class test1234this1125 {
    public static void  main(String[]args){
        //對象1
        test ss =new test();
        ss.setName("qf");
        ss.setAge(28);
        System.out.println(ss.getName()+'-'+ss.getAge());
        //對象2
        test ss2=new test();
        ss2.setAge(27);
        ss2.setName("sf");
        System.out.println(ss2.getName()+'-'+ss2.getAge());
    }
}
