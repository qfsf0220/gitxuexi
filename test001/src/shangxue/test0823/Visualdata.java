package shangxue.test0823;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Administrator on 2017/8/23.
 */
public class Visualdata {
    public static void main(String[] args) {

        String time = "1988-7-2";
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse(time);
            Calendar cal = new GregorianCalendar();
            cal.setTime(date);

            int day = cal.get(Calendar.DATE);

            cal.set(Calendar.DATE,1);
            int week = cal.get(Calendar.DAY_OF_WEEK); //获取 1号是礼拜几
//            System.out.println(week);
            int daymax = cal.getActualMaximum(Calendar.DATE);
//            System.out.println(daymax);
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            for (int i=0;i<week-1;i++){
                System.out.print('\t');
            }

            for (int i = 1; i <= daymax; i++) {
                if(i ==day){
                    System.out.printf("<%s>\t",i);
                }else {
                    System.out.print(i + "\t");
                }
                int w= cal.get(Calendar.DAY_OF_WEEK) ;
                if (w==Calendar.SATURDAY) {
                    System.out.println();
                }
                cal.add(Calendar.DATE,1);
            }
        }catch(ParseException e){
                    e.printStackTrace();
                }
            }
    }

