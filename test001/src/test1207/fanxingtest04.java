package test1207;
/*设置多个泛型
* */
class gf<F,S>{
    private S key;
    private F value;

    public S getKey() {
        return key;
    }

    public F getValue() {
        return value;
    }

    public void setValue(F value) {
        this.value = value;
    }

    public void setKey(S key) {
        this.key = key;
    }
}


public class fanxingtest04 {
    public static void main(String[]args){
        gf<Integer,String> g=new gf<>();
        g.setValue(99);
        g.setKey("qf");
        System.out.println(g.getKey()+g.getValue());
    }
}
