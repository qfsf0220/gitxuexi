package heima;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by qfsf on 2017/8/26.
 */
public class FrameTest {
    public static void main(String[] args) {
        Frame f = new Frame("my awt");
        f.setSize(500,500);
        f.setLocation(200,200);
        f.setLayout(new FlowLayout());

        Button b= new Button("button1");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("enter button to close（动作事件 比鼠标事件优先执行）");
//                System.exit(0);
            }
        }
        );
        b.addMouseListener(new MouseAdapter() {
                               private int a = 1;
                               @Override
                               public void mouseEntered(MouseEvent e) {

                                   super.mouseEntered(e);
                                   System.out.println("Mouse move in "+a++);
                               }

                               @Override
                               public void mouseClicked(MouseEvent e) {
                                   super.mouseClicked(e);
                                   if(e.getClickCount()==2){
                                       System.out.println("double click"+a++);
                                   }else System.out.println("click"+a++);
                               }
                           }
        );




        f.add(b);
        f.setVisible(true);

        f.addWindowListener(new mywin());

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.out.println("close");
                System.exit(6);
            }
            public void windowActivated(WindowEvent e){
                System.out.println("active");
            }

            @Override
            public void windowLostFocus(WindowEvent e) {

                System.out.println("lost focus");
            }
        });
    }
}
//
class mywin extends WindowAdapter{
    @Override
    public void windowLostFocus(WindowEvent e) {

        super.windowClosing(e);
        System.out.println("关闭");
        System.exit(9);
    }


}
