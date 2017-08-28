package heima.test0828;

import sun.swing.WindowsPlacesBar;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

/**
 * Created by Administrator on 2017/8/28.
 */

class Mywindow{
    private Frame f;
    private TextField tf ;
    private Button but;
    private TextArea ta;
    private Dialog d;
    private Label l;
    private Button but2;

    Mywindow(){
        init();
    }
    public void init(){
        f=new Frame("G.E.T.D.I.R");
        f.setBounds(100,100,500,500);
        f.setLayout(new FlowLayout());

        tf = new TextField(50);
        but = new Button("get dir");
        ta = new TextArea("blank",25,60);
        d = new Dialog(f,"oh no,it is error",true);//modal 为true dialog没确认前无法操作Frame。
        d.setBounds(250,250,199,99);
        d.setLayout(new FlowLayout());
        l = new Label();
        but2 = new Button("ok");

        f.add(tf);
        f.add(but);
        f.add(ta);

        d.add(l);
        d.add(but2);

        myEvent();
        f.setVisible(true);
    }
    private void myEvent(){
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        d.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                d.setVisible(false);
            }
        });

        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.setVisible(false);
            }
        });

        but2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==e.VK_ENTER){
                    d.setVisible(true);
                }
            }
        });

        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_ENTER){
                    showDir();

                }
            }
        });

        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String text = tf.getText();

//                ta.setText(text);
//                System.out.println(text);
                    showDir();
//                tf.setText("");
            }
        });

    }
    private void showDir(){
        String dirPath = tf.getText();
        File dir = new File(dirPath);
        if(dir.exists() && dir.isDirectory()){
            ta.setText("");
            String [] names = dir.list();
            for (String i :names){
                ta.append(i+"\r\n");
            }
        }else{
            String info = "path error: "+dirPath +",please check it ";
            l.setText(info);
            d.setVisible(true);
        }
    }
}

public class FrameGetDir {
    public static void main(String[] args) {
        new Mywindow();
    }
}