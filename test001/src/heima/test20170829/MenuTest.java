package heima.test20170829;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

/**
 * Created by Administrator on 2017/8/29.
 */
public class MenuTest {

    private Frame f ;
    private MenuBar mb;
    private Menu m,m2,subMenu,subMenu2,subMenu3;
    private MenuItem closeItem,subItem1,subItem2,subItem3,subItem4,subItem5;
    private FileDialog openDia,saveDia;
    private TextArea ta;


    private  File file;

    MenuTest(){
        init();
    }

    public void init(){
        f=new Frame("HI  BOSS");
        f.setBounds(100,100,500,500);
//        f.setLayout(new FlowLayout());
        ta = new TextArea("\n\n\nd\ne\nf\na\nu\nl\nt\n\nt\ne\nx\nt\n");

        mb = new MenuBar();
        m = new Menu("File");
        m2= new Menu("help");
        subMenu = new Menu("test");
        subMenu2 = new Menu("Operate");
        subMenu3 = new Menu("about");

        subItem1 = new MenuItem("11111");
        subItem2=new MenuItem("open");
        subItem3=new MenuItem("save");
        subItem4=new MenuItem("...");
        subItem5=new MenuItem("V0.0.1  by qfsf");
        closeItem = new MenuItem("Exit");

        subMenu.add(subItem1);
        subMenu2.add(subItem2);
        subMenu2.add(subItem3);
        subMenu2.add(subItem4);
        subMenu3.add(subItem5);

        m.add(subMenu);
        m.add(subMenu2);
        m.add(closeItem);
        m2.add(subMenu3);
        mb.add(m);
        mb.add(m);
        mb.add(m2);
        f.setMenuBar(mb);
        f.add(ta);
        f.setVisible(true);

        openDia = new FileDialog(f,"my open",FileDialog.LOAD);
        saveDia = new FileDialog(f,"my save",FileDialog.SAVE);

        myEvent();
    }

    private  void myEvent(){
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        closeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        subItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (file==null  ){
                    saveDia.setVisible(true);
                    String dirPath = saveDia.getDirectory();
                    String fileName = saveDia.getFile();



                    if(dirPath==null || fileName == null)
                        return;
                    file = new File(dirPath,fileName);

                }
                    try{
                        BufferedWriter buff = new BufferedWriter(new FileWriter(file));
                        String text = ta.getText();
                        buff.write(text);
                    }catch (IOException eee){
                        throw new RuntimeException(eee);
                    }

            }
        });


        subItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDia.setVisible(true);
                String dirPath = openDia.getDirectory();
                String fileName = openDia.getFile();
                System.out.println(dirPath+".."+fileName);
                if (dirPath==null || fileName==null){
                    return;
                }
                ta.setText("");
                file = new File(dirPath,fileName);
                try {
                    BufferedReader buff = new BufferedReader(new FileReader(file));
                    String line = null;
                    while ((line=buff.readLine()) !=null){
                        ta.append(line+"\r\n") ;
                    }
                    buff.close();
                }catch (IOException ee){
                    throw new RuntimeException("read file error");
                }


            }
        });



    }

    public static void main(String[] args) {
        new MenuTest();
    }
}
