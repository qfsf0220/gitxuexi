package test170105;


import java.io.*;

/**
 * Created by qf on 2017/1/5.
 *
 * BufferedReader and BufferedWriter useing
 */
public class huanchongliu {
    public static void main(String []args){
        String[] aa = {"qf","sf","love","qpr"};
        File file = new File("/Users/qf/test/testdir/test0105_3.txt");
        //创建 BufferedReader and BufferedWriter 前 需要底层 的 filereader 和filewtirer
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(String str:aa){
                bw.write(str);
                bw.newLine();//换行
            }
            bw.close();
            fw.close();

            //读取 输入流
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String str = null;//如果读到数据尾部就是空
            while((str = br.readLine() ) !=null){
                System.out.println(str);
            }
            br.close();
            fr.close();





        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
