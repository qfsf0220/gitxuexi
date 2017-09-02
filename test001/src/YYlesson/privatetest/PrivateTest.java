package YYlesson.privatetest;

/**
 * Created by qfsf on 2017/9/2.
 */
class SS{
    private  String name;
    private int age;
    //get

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //set

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class PrivateTest {
    public static void main(String[] args) {
        SS s  =new SS();
        System.out.println(s.getName()+s.getAge());

    }
}
