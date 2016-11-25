/**
 * Created by qfsf on 2016/11/25.
 *構造方法：
 * 給對象的數據進行初始化
 *
 *格式：1.方法名和類名相同
 * 2.沒有具體的返回值，連void也沒有
 * 3、沒有具體的返回值。
 */
class  Studentx{
    public Studentx(){
        System.out.println("这个是一个构造方法");
    }
}


public class gouzaofangfa1125 {
    public static void main(String []args){
        //创建一个对象
        Studentx ss=new Studentx();
        System.out.println(ss);
    }
}
