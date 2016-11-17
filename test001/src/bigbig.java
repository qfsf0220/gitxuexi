import java.math.*;
public class bigbig {
 	public static void main(String[] args){
    BigInteger a = BigInteger.valueOf(222222222);
    BigInteger b = BigInteger.valueOf(333333333);
    BigInteger c =a.add(b);
    BigInteger d= c.multiply(b.multiply(BigInteger.valueOf(2222222)));

    System.out.println(c);
    System.out.println(d);
	}
 }
