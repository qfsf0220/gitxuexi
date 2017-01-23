package jktest.test170117;

/**
 * @author feng.qian
 * @create at 2017-01-22 14:45
 */


public class stringtest {
    public static void main(String[] args) {
        int [] inta = {1,2,3,4};

        System.out.println(inta.length);
//        int sa = new String(Integer.parseInt(inta));
        char [] c= new char[inta.length];
        for(int i=0;i<inta.length;i++){
            c[i]=(char)(inta[i]);
//            System.out.println(c[i]);
        }
        String sa = new String(c);

        System.out.println(c[0]);
        System.out.println(sa);



        char[] chara = {'a','b','c'};
        String ca = new String(chara);


//        System.out.println(ca);
    }
}
