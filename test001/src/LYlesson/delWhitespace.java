package LYlesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by qfsf on 2017/9/9.
 */
public class delWhitespace {
    public static void main(String[] args) {
        String testStr = "this is a test";

        String result = (String) removeDupwhitespace(testStr);
        System.out.println(result);

    }
   public static CharSequence removeDupwhitespace(CharSequence inputstr){
       String patten="\\s+";
       String repstr="";
       Pattern p = Pattern.compile(patten);
       Matcher m = p.matcher(inputstr);
       return  m.replaceAll(repstr);
   }
}
