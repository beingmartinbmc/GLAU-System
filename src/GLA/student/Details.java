package GLA.student;

import GLA.backend.Connectivity;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Details{
    private JFrame frame;
    private JPanel panel;
    private JLabel a,b,c,back,e,f,g,h,i,j;
    private BufferedImage d;
    private ImageIcon background;
    private Image img,temp;

    public Details()throws Exception{
        frame=new JFrame();
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(2);
        frame.setLocationRelativeTo(null);
        panel=new JPanel();
        panel.setLayout(null);

        d= ImageIO.read(new File(Connectivity.path[Connectivity.index]));
        a=new JLabel(new ImageIcon(d));
        g=new JLabel(Connectivity.phone[Connectivity.index]);
        j=new JLabel(Connectivity.name[Connectivity.index]);

        j.setFont(new Font("Times New Roman", Font.BOLD,18));
        j.setForeground(Color.BLACK);
        g.setFont(new Font("Times New Roman", Font.BOLD,18));
        g.setForeground(Color.BLACK);
        h=new JLabel(Connectivity.email[Connectivity.index]);
        h.setFont(new Font("Times New Roman", Font.BOLD,18));
        h.setForeground(Color.BLACK);
        f=new JLabel(Connectivity.id[Connectivity.index]);
        f.setFont(new Font("Times New Roman", Font.BOLD,18));
        f.setForeground(Color.BLACK);

        b=new JLabel();
        c=new JLabel();
        e=new JLabel();
        i=new JLabel();

        i.setIcon(new ImageIcon("images\\avatar.png"));
        b.setIcon(new ImageIcon("images\\phone.png"));
        c.setIcon(new ImageIcon("images\\email.png"));
        e.setIcon(new ImageIcon("images\\id.png"));

        background=new ImageIcon("images\\details.jpg");
        img=background.getImage();
        temp=img.getScaledInstance(600,600,4);
        background=new ImageIcon(temp);
        back=new JLabel(background);
        back.setLayout(null);
        back.setBounds(0,0,600,600);

        a.setBounds(150,0,200,300);
        i.setBounds(150,350,32,32);
        j.setBounds(200,355,200,15);
        c.setBounds(150,390,32,32);
        h.setBounds(200,395,280,15);
        e.setBounds(150,430,32,32);
        f.setBounds(200,435,100,15);
        b.setBounds(150,480,32,32);
        g.setBounds(200,485,120,15);

        panel.add(a);panel.add(i);panel.add(c);
        panel.add(e);panel.add(g);panel.add(h);
        panel.add(b);panel.add(f);panel.add(j);panel.add(g);
        panel.add(back);
        frame.add(panel);
        frame.setVisible(true);
        JOptionPane.showMessageDialog(frame,"Welcome "+Connectivity.name[Connectivity.index]+"!");
    }
}
