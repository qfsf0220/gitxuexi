package shangxue.test0823;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Administrator on 2017/8/24.
 */
public class FrameTest extends Frame {
    Image img = GameUtil.getImage("shangxue/test0823/st.gif");

    public void launchFrame(){//加载窗口
        setSize(300,300);
        setLocation(66,66);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(20,40,131,151);
        g.drawRect(20,40,111,111);
        g.drawOval(20,40,111,111);
        g.setColor(Color.red);
        Font f = new Font("幼圆",Font.BOLD,15);
        g.setFont(f);
        g.drawString("各位老总\n不错的",30,80);
        g.setColor(Color.black);
        g.fillRect(60,60,20,20);//填充长方形。

        g.drawImage(img,100,100,null);

    }

    static class GameUtil{
        public static Image getImage(String path){
            URL u =GameUtil.class.getClassLoader().getResource(path);
            BufferedImage img = null;
            try {
                img = ImageIO.read(u);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return img;
        }

    }


    public static void main(String[] args) {
        FrameTest ft  = new FrameTest();
        ft.launchFrame();
    }
}
