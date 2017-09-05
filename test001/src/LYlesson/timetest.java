package LYlesson;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.lang.String;


/**
 * Created by Administrator on 2017/9/4.
 */
public class timetest {
    public static void main(String[] args) {
        //date
        LocalDate a  = LocalDate.now();
        System.out.println(a);
        LocalDate ab =  LocalDate.ofEpochDay(5);
        System.out.println(ab);
        System.out.println(a.MAX);
        System.out.println(  a.of(2011,11,11)  );
        System.out.println(a.parse( "1999-11-11"));
        System.out.println(a.plusDays(5));
        System.out.println(a.plusYears(2));
        System.out.println(a.minus(2, ChronoUnit.YEARS));
        System.out.println(a.isLeapYear());
        System.out.println(   a.with(TemporalAdjusters.firstDayOfMonth())  );
        System.out.println(a.parse("1990-11-11").with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println( a.equals(a.of(2017,9,4))   );
        //time
        LocalTime now = LocalTime.now();
        System.out.println( now );
        System.out.println( now.parse("22:22"));
        System.out.println(now.of(18,18));
        System.out.println(now.parse("22:22").plus(1,ChronoUnit.HOURS));//22:22分之后的一小时
        System.out.println(now.getHour()+":"+now.getMinute()+":"+now.getSecond());
        System.out.println(now.of(18,11).isBefore(now)); //18:11分是不是在现在之后 （现在是17:34）
        System.out.println(now.MAX);


        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);

        System.out.println( now2.plusDays(2) );

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" yyyy-mm-dd HH:mm:ss");
        System.out.println(now2.format(dtf));

        LocalDateTime localDateTime = LocalDateTime.parse("2017-07-20T15:27:44");
        System.out.println("字符串"+localDateTime);


        StringBuffer sb = new StringBuffer(now2.format(dtf));

        System.out.println(sb.length() );
        sb.append("qf");
        sb.trimToSize();

        System.out.println("zzzzzzzzzzzz");
        String ss = now2.format(dtf);

        String sslist[] =ss.trim().split("[,-,\\s+]" );
        for(String i : sslist){
            System.out.println(i);
        }


        boolean b = "abc".matches("[a,b,c]{3}");
        System.out.println(b);


    }
}

class RegexTest {
    public static void main(String[] args) {
        checkPhone();
    }

    public static void checkPhone(){
        String phone="13681891872";
        String regex = "[1-9][0-9]{10}";
        boolean flag = phone.matches(regex);
        if(flag){
            System.out.println("phone number is ok");
        }else System.err.println("phone number is error");
    }
}
