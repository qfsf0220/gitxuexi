package shangxue.test0908;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2017/9/8.
 */
public class ExceptionTest {
    public static void main(String[] args) {
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

    }



    class ttttt {
        public void tfunc(){
            System.out.println("123123");
        }
    }
}
