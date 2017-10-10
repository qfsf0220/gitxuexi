package yibai.EnumTest;

/**
 * Created by Administrator on 2017/10/10.
 */
public class EnumTest001 {
    public static void main(String[] args) {
        Geweilaozong gwlz;
        System.out.println("who is the future boss?");
        switch (gwlz = Geweilaozong.XIAOHUOZI) {
            case ZHANGZONG:
                System.out.println("This is zhangzong.");
                break;
            case YANGZONG:
                System.out.println("This is yangzong.");
                break;
            case DANGE:
                System.out.println("This is dange.");
                break;
            case XIAOHUOZI:
                System.out.println("This is xiaohuozi.");
                break;
        }
        boss.HasIphone y = boss.HasIphone.YOU;
        boss.HasIphone my = boss.HasIphone.MEIYOU;
        System.out.println("有没有:"+y);
        System.out.println("有没有:"+my);
    }
}
enum Geweilaozong{
    ZHANGZONG,YANGZONG,DANGE,XIAOHUOZI;
}
class boss{
    enum HasIphone{
        YOU,MEIYOU;
    }
}

