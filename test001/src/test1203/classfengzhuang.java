package test1203;

/**
 * Created by qfsf on 2016/12/3.
 */
class fengzhuang{
    private  int age;
    private  String name;

    public  void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class classfengzhuang {
    public static void main(String[] args) {
        fengzhuang f = new fengzhuang();
        f.setAge(27);
        f.setName("qf");
        System.out.println("age:"+f.getAge()+"岁"+" name:"+f.getName());

    }
}
