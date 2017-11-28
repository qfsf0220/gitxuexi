package test171120;

/**
 * Created by Administrator on 2017/11/20.
 */


import jdk.nashorn.internal.scripts.JD;
import jodd.datetime.JDateTime;
import jodd.datetime.Period;
import  jodd.format.Printf;
import jodd.io.watch.DirWatcher;
import jodd.util.StringUtil;

import java.sql.Timestamp;
import jodd.datetime.DateTimeStamp;
import jodd.madvoc.meta.In;
import jodd.mail.Email;
import jodd.typeconverter.TypeConverterManager;
import jodd.util.StringUtil;
import jodd.util.SystemUtil;
import sun.plugin.com.TypeConverter;

import javax.print.attribute.IntegerSyntax;
import java.net.StandardSocketOptions;

import java.util.Calendar;

public class joddtest {
    public static void main(String[] args) {
       testprint();
       joddtest jd = new joddtest();
       jd.dateTest();
       jd.sendEmail();
       jd.strTest();
    }

    private static void testprint(){
        Printf.str("%04d", 1666);
        Printf.str("%f", 0.5);
    }
    private void dateTest(){
        JDateTime jdt = new JDateTime(System.currentTimeMillis());
        jdt.setFormat("YYYY年MM月DD日 hh:mm:ss");
        System.out.println("----");
        System.out.println(new JDateTime(2012, 2, 2));
        System.out.println(new JDateTime(System.currentTimeMillis()));
        System.out.println(System.currentTimeMillis());
        jdt.addHour(1);
        System.out.println(jdt);
        JDateTime jdt2 = new JDateTime(1988, 7, 02, 10, 1, 1,1);
        System.out.println(jdt2);
        Calendar c =jdt.convertToCalendar();

        System.out.println(jdt.convertToSqlTimestamp());


        System.out.println("不知不觉，你已经活了"+new Period(jdt,jdt2).getDays()+"天");
        System.out.println((360*16));
        System.out.println(System.currentTimeMillis());
    }

    private void strTest(){
        String a = "asdascxvdfyhertw";
        String ab = StringUtil.capitalize("q23");
        String [] al = StringUtil.split(a,"d");
        for (String i:al){
            System.out.println(i);
        }
        DirWatcher dw= new DirWatcher("e:/","*.py");
        
    }

    private void sendEmail(){
//        Email email = Email.create().from("qq@qq.com").to("82970496@qq.com").subject("hello").addText("this is a test");
    }


}
