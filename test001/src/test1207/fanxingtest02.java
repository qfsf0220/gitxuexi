package test1207;

/*f泛型的格式
访问权限  class 类名<泛型,泛型...>{
    属性
    方法
}
创建对象
    类名<类型> 对象名 = new 类名<类型>();
* */
class tt<A>{
    private A x;
    private A y;

    A getX() {
        return x;
    }
    public void setX(A x) {
        this.x = x;
    }
    public A getY() {
        return y;
    }
    public void setY(A y) {
        this.y = y;
    }


}


public class fanxingtest02 {
    public static void main(String[]args){

        tt<Integer> t= new tt<>();
        t.setX(10);
        t.setY(20);
        System.out.println(t.getX()+"  "+t.getY());

        tt<String> ts = new tt<>();
        ts.setY("y shi 10");
        ts.setX("x shi 20");
        System.out.println(ts.getX()+ts.getY());
    }
}
