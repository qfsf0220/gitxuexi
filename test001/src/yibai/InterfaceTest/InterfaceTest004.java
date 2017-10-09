package yibai.InterfaceTest;

/**
 * Created by Administrator on 2017/10/9.
 */
//实现多个接口
public class InterfaceTest004 {
    public static void main(String[] args) {

    }
}

interface  A1{
    int a1add(int n1, int n2);
}
interface A2{
    int a2add(int n1, int n2);
}

class MM implements A1,A2{
    public int a1add(int n1, int n2){
        return n1+n2;
    }
    public int a2add(int n1, int n2){
        return  n1+n2;
    }

}
