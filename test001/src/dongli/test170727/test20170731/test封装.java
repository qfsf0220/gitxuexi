package dongli.test170727.test20170731;

public class test封装 {
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

    public static void  main(String[]a){
        test封装 t = new test封装();
        t.setName("张总1");
        if(t.getName()!=null)
        System.out.println(t.getName());

    }
}
