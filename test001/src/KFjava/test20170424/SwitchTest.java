package KFjava.test20170424;

/**
 * Created by Administrator on 2017/4/24.
 */
public class SwitchTest {
    public  static void main (String []args){
        char score = 'C';
        switch (score){
            case 'A':
                System.out.println("YOU");
                break;
            case 'B':
                System.out.println("LIANG");
                break;
            case 'C':
                System.out.println("JIGE");
                break;
            case 'D':
                System.out.println("BUJIGRE");
            default:
                System.out.println("INPUT ERROR.");
        }
        String season= "夏天";
        switch (season){
            case "春天":
                System.out.println("spring is coming ");

            case "夏天":
                System.out.println("summer is coming ");
                //这里注意  switch 后面的expression 表达式数据类型只能是 byte short char 和 int
                //String 和  枚举 java7以后才支持。 case后如果没有break  就是case穿透。

                break;

            case "秋天":
                System.out.println("autumn is coming ");
                break;
            case "冬天":
                System.out.println("winter is coming ");
                break;
                default:
                    System.out.println("not a season...");
        }
    }
}
