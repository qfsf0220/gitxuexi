package LYlesson;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

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








    }
}
