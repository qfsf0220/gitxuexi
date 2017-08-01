package dongli.test170727.test20170731;

public class test封装 {

    public static void  main(String[]a){
        asd t = new asd();
        //t.name="xxx";//注意这里private的限制 作用域仅仅是同一个class中。
        t.setName("张总1");
        if(t.getName()!=null)
            System.out.println(t.getName());

    }

}

class asd{
    private String name;
    public void setName(String name) {
        if (name != "张总"){
            System.out.println("对不起，参数必须是张总");
            return;
        }else{
            this.name=name;
        }
    }

    public String getName() {
        return name;
    }
}
