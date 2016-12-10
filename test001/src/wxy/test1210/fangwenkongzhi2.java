package wxy.test1210;

/**
 * Created by qfsf on 2016/12/10.
 */
class Dog2{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void show(){
        System.out.println("name:"+getName()+" age:"+getAge());
    }
}


class fangwenkongzhi2 {
    public static void main(String[] args) {
        Dog2    d = new Dog2();
        d.setAge(6);
        d.setName("shasha");
        d.show();
    }
}
