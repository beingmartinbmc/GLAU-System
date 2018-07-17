package GLA;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Help {
    private JFrame frame;
    private JPanel panel;
    private BufferedImage q,w,e;
    private JLabel a,s,d,back;
    private ImageIcon background;
    private Image img,temp;

    public Help()throws IOException {
        frame=new JFrame();
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(2);
        panel=new JPanel();
        panel.setLayout(null);

        background=new ImageIcon("./images\\helpbackground.jpg");
        img=background.getImage();
        temp=img.getScaledInstance(500,600,4);
        background=new ImageIcon(temp);
        back=new JLabel(background);
        back.setLayout(null);
        back.setBounds(0,0,500,600);

        q=ImageIO.read(new File("./images\\book.png"));
        w=ImageIO.read(new File("./images\\social-care.png"));
        a=new JLabel(new ImageIcon(q));
        s=new JLabel(new ImageIcon(w));

        a.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    new Homework();
                }
                catch (IOException g){g.printStackTrace();}
            }
        });
        a.setBounds(170,50,128,128);
        s.setBounds(170,200,128,128);
        s.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               try{ new Security();}
               catch (IOException z){z.printStackTrace();}
            }
        });
        panel.add(a);panel.add(s);
        panel.add(back);
        frame.add(panel);
        frame.setVisible(true);
    }
}
