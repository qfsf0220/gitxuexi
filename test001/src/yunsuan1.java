public class yunsuan1 {
    static int a = 4;
    static int b = 4;
    static int m = 5* ++a;
    static int n = 5* b++;
    static double c= 9.998;
    static int ic = (int)c;
    static int ic_sishewuru = (int) Math.round(c);
    static int d = 123456;
    static double d2 = (float) d;
    static double d3 = d2;
    public static void main (String [] args){
        System.out.println("a:"+a+" b:"+b+" m:"+m+" n:"+n);
        System.out.println(ic);
        System.out.println(ic_sishewuru);
        System.out.println(d2);
        System.out.println(d3);
    }
}
