package test1204;

/**
 * this is a test for private
 *
 * @author feng.qian
 * @create at 2016-12-05 10:58
 */

class test05{
    test05(){System.out.println("sdfasdsdf");} //构造方法 只要 调用就能运行
    test05(int a){
        System.out.println("222222");
    }


    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


}

public class test1205 {
    public static void main(String[] args) {
        test05 t =new test05();

        t.setName("qf");
        t.setAge(28);

        System.out.println("name:"+t.getName()+ " age:"+t.getAge());
    }
}
