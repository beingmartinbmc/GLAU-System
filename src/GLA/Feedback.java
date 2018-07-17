package GLA;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Feedback {
    private JFrame frame;
    private JPanel panel;
    private BufferedImage q,w,e,r,t,y;
    private JLabel a,s,d,f,g,h,back;
    private ImageIcon background;
    private Image img,temp;

    public Feedback()throws IOException {
        frame=new JFrame();
        frame.setTitle("Dashboard");
        frame.setLocation(200,0);
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(2);
        panel=new JPanel();
        panel.setLayout(null);
        q=ImageIO.read(new File("D:\\GLA Simulation\\images\\info.png"));
        w=ImageIO.read(new File("D:\\GLA Simulation\\images\\help.png"));
        e=ImageIO.read(new File("D:\\GLA Simulation\\images\\results.png"));
        r=ImageIO.read(new File("D:\\GLA Simulation\\images\\attendance.png"));
        t=ImageIO.read(new File("D:\\GLA Simulation\\images\\logout.png"));

        a=new JLabel(new ImageIcon(q));
        s=new JLabel(new ImageIcon(w));
        d=new JLabel(new ImageIcon(e));
        f=new JLabel(new ImageIcon(r));
        g=new JLabel(new ImageIcon(t));
        a.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    new Details();
                }catch (Exception h){h.printStackTrace();}
            }
        });
        s.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    new Help();
                }
                catch (IOException z){
                    z.printStackTrace();
                }
            }
        });
        d.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Results();
            }
        });
        g.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int a=JOptionPane.showConfirmDialog(frame,"Are you sure?");
                if(a==0) {
                    try{
                    new Management();}catch (IOException h){h.printStackTrace();}
                    frame.dispose();
                }
            }
        });
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Attendance();
            }
        });
        background=new ImageIcon("D:\\GLA Simulation\\images\\feedbackground.jpg");
        img=background.getImage();
        temp=img.getScaledInstance(700,700,4);
        background=new ImageIcon(temp);
        back=new JLabel(background);
        back.setLayout(null);
        back.setBounds(0,0,700,700);

        a.setBounds(50,100,128,128);
        s.setBounds(50,300,128,128);
        d.setBounds(480,100,128,128);
        f.setBounds(480,300,128,128);
        g.setBounds(250,500,128,128);

        panel.add(a);panel.add(s);panel.add(d);panel.add(f);panel.add(g);
        panel.add(back);
        frame.add(panel);
        frame.setVisible(true);
    }

}
