package GLA;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@interface Author{
    String name();
    String date();
}
@Author(name="Ankit Sharma", date="June 24 2018")
public class Management {
    private static JFrame frame;
    private static JPanel panel;
    private static BufferedImage a,b,c;
    private static JLabel f,g,h;

    public Management()throws IOException {
        frame=new JFrame();
        frame.setSize(640,730);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        a=ImageIO.read(new File("images\\logo.jpg"));
        b=ImageIO.read(new File("images\\student-hat.png"));
        c=ImageIO.read(new File("images\\close.png"));

        g=new JLabel(new ImageIcon(b));
        f=new JLabel(new ImageIcon(a));
        h=new JLabel(new ImageIcon(c));
        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);

        f.setBounds(10,0,600,350);
        g.setBounds(50,390,256,256);
        h.setBounds(380,450,128,128);
        h.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame,"Have a great day!");
                frame.dispose();
            }
        });
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame,"With an alumni base of more than 17,000 students.\n" +
                        "GLAians are establishing a reputation to make a difference wherever they go. \n" +
                        "The university employs over 600 qualified teachers and over 700 staff members.");
            }
        });
        g.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new StudentLogin();
                frame.dispose();
            }
        });
        panel.add(f);
        panel.add(g);
        panel.add(h);
        frame.setDefaultCloseOperation(3);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String ...s)throws IOException{
        new Management();
    }
}
