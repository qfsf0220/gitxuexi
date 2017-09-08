package shangxue.test0908;

import KFjava.test20170523.ParametersTrans;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import sun.net.TelnetProtocolException;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import  java.lang.String;
import java.text.ParseException;

/**
 * Created by Administrator on 2017/9/8.
 */

//3个方式。 1 try catch 2 方法throws  3 方法体内 手动 throw
public class ExceptionTest {
    public static void  main(String[] args) {
        //nullpoint
        ttttt t  = null;
        if (t != null) { //手动处理 nullpoint 错误
            t.tfunc();  //这里 t对象 为空  就会 nullpoint 错误 一般都是空对象 或者空属性造成的
        }

        FileReader fr = null;
        try {
             fr  =new FileReader("e:\\qftest");
            char c = (char) fr.read();
            char c2 = (char) fr.read();
            String frstr = fr.toString();
            System.out.println(frstr);

            System.out.println(c+""+c2);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File f = new File("e://t.txt");

        if (!f.exists()){
            try {
                throw new FileNotFoundException(); //手动抛出异常，使用不多。
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    class ttttt {
        public void tfunc(){
            System.out.println("123123");
        }
    }

//子类抛出异常不能大于父类抛出异常
    class aa{
        public void fa()throws IOException{ }
    }
    class bb extends aa{
        public void fa()throws FileNotFoundException{  }
    }
    class cc extends aa{
//        public void fa()throws IOException,ParseException {} //这个ParseException错误不是子类
    }
    class dd extends  aa{
//        public  void fa()throws  Exception{} //这个是Exception 是IOException的父类也是错误。
    }


}
