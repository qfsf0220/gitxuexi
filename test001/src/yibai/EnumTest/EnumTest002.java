package yibai.EnumTest;

/**
 * Created by Administrator on 2017/10/10.
 */
//枚举类型可以实现接口
public class EnumTest002 {
    public static void main(String[] args) {
        Level [] a = Level.values();
        for(Command i :a) {
            i.execute();
        }
        System.out.println("-----");
        for( Level lv:Level.values()){
            String name =lv.name();
            int ord = lv.ordinal();
            System.out.println(ord+" "+name);
        }
        System.out.println("序号0是："+Level.values()[0].ordinal()+"  Level有没有 LOW："+Level.valueOf("LOW"));
    }
}
interface Command{
    void execute();
}
enum    Level implements Command{
    LOW{
        @Override
        public void execute() {
            System.out.println("low!");
        }
    },
    MEDIUM{
        @Override
        public void execute() {
            System.out.println("medium.");
        }
    },
    HIGH{
        @Override
        public void execute() {
            System.out.println("high.");
        }
    }
}

