package yibai;

import java.applet.Applet;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.awt.*;
import java.applet.*;

import java.applet.*;
import java.awt.*;
import java.util.*;
/**
 * Created by Administrator on 2017/9/15.
 */
public class ClockApplet extends Applet implements Runnable{
    Thread t,t1;
    public void start(){
        t = new Thread(this);
        t.start();
    }
    public void run(){
        t1 = Thread.currentThread();
        while(t1 == t){
            repaint();
            try{
                t1.sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
    public void paint(Graphics g){
        Calendar cal = new GregorianCalendar();
        String hour = String.valueOf(cal.get(Calendar.HOUR));
        String minute = String.valueOf(cal.get(Calendar.MINUTE));
        String second = String.valueOf(cal.get(Calendar.SECOND));
        g.drawString(hour + ":" + minute + ":" + second, 20, 30);
    }
}