package wxy.test1219.jiekou;

/**
 * 在抽象类中，可以包含一个或多个抽象方法；但在接口(interface)中，所有的方法必须都是抽象的，不能有方法体，它比抽象类更加“抽象”。
 *
 * 接口使用 interface 关键字来声明，可以看做是一种特殊的抽象类，可以指定一个类必须做什么，而不是规定它如何去做。
 * @author feng.qian
 * @create at 2016-12-19 18:12
 */


public class interfacetest {
    public static void main(String[] args) {
        satassd s1 = new ssd1(); //初始化 ssd1
        satassd s2 = new ssd2(); //初始化 ssd2

        s1.write("aaa");
        s1.read();
//        satassd s3 = new ssd3() {
//            @Override
//            public void write(String abc) {
//
//            }
//        };

        //抽象类 无法被实力化   这里重载了 write方法  但是本意是 这个ssd坏了无法写

    }

    }

    interface satassd {
        public static final int CONLINE = 4;

        public void write(String abc);

        public String read();
    }

    interface fixssd {
        String add = "shanghai";

        boolean hasfixed();
    }
//ssd1
    class ssd1 implements satassd,fixssd {

        public void write(String abc) {
            System.out.println("数据写ok。");
        }



        public String read() {
            return "数据读ok。";
        }


        public boolean hasfixed() {
            return true;
        }
    }
//ssd2
    class ssd2 implements satassd {
        public String read() {
            return "读取数据完成";
        }

        public void write(String abc) {
            System.out.println("写完成。");
        }
    }

//ssd3
    abstract class ssd3 implements satassd {
        public String read() {
            return "数据已经读取。写没办法";
        }
    }


