package GLA.teachers;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Security {
    private JFrame frame;
    private JPanel panel;
    private BufferedImage q,w,e;
    private JLabel a,s,d,back;
    private ImageIcon background;
    private Image img,temp;

    Security()throws IOException {
        frame = new JFrame();
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(2);
        panel = new JPanel();
        panel.setLayout(null);

        q=ImageIO.read(new File("D:\\GLA Simulation\\src\\images\\HOD.jpg"));
        w=ImageIO.read(new File("D:\\GLA Simulation\\src\\images\\manas.jpg"));
        e=ImageIO.read(new File("D:\\GLA Simulation\\src\\images\\ashish.jpg"));

        a=new JLabel(new ImageIcon(q));
        s=new JLabel(new ImageIcon(w));
        d=new JLabel(new ImageIcon(e));

        a.setBounds(170,50,93,115);
        a.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame,"Prof. Anand Singh Jalal\nJob Title: Head of Department(CSE)\nContact Details:\nEmail: asjalal@gla.ac.in\nContact Number: 7351894030");
            }
        });
        s.setBounds(170,200,93,120);
        s.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame,"Dr. Manas Kumar Mishra\nJob Title: Cyber Security Expert\nContact Details:\nEmail: manas.mishra@gla.ac.in\nContact Number: 9956250356");
            }
        });
        d.setBounds(170,350,93,120);
        d.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame,"Prof. Ashish Sharma\nJob Title: Proctorial Head\nContact Details:\nEmail: ashish.sharma@gla.ac.in\nContact Number: 9412353562");
            }
        });

        background = new ImageIcon("images\\securitybackground.jpg");
        img = background.getImage();
        temp = img.getScaledInstance(500, 600, 4);
        background = new ImageIcon(temp);
        back = new JLabel(background);
        back.setLayout(null);
        back.setBounds(0, 0, 500, 600);

        panel.add(a);panel.add(s);panel.add(d);
        panel.add(back);
        frame.add(panel);
        frame.setVisible(true);
    }
}
