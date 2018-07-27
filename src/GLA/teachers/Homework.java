package GLA.teachers;

import GLA.backend.ConnectTeacher;
import GLA.backend.Connectivity;
import GLA.student.StudentLogin;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Homework {
    private JFrame frame;
    private JPanel panel;
    private BufferedImage q,w,e,r,t,y,u;
    private JLabel a,s,d,f,g,h,j,k,back;
    private ImageIcon background;
    private Image img,temp;

    Homework()throws IOException {
        frame = new JFrame();
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(2);
        panel = new JPanel();
        panel.setLayout(null);

        try{
            ConnectTeacher.fetchDetails();}catch (Exception h){}
        ConnectTeacher.index= StudentLogin.returnIndex(Connectivity.id[Connectivity.index],ConnectTeacher.id);

        q=ImageIO.read(new File(ConnectTeacher.name1[ConnectTeacher.index]));
        w=ImageIO.read(new File(ConnectTeacher.name2[ConnectTeacher.index]));
        r=ImageIO.read(new File(ConnectTeacher.name3[ConnectTeacher.index]));
        t=ImageIO.read(new File(ConnectTeacher.name4[ConnectTeacher.index]));
        y=ImageIO.read(new File(ConnectTeacher.name5[ConnectTeacher.index]));
        u=ImageIO.read(new File(ConnectTeacher.name6[ConnectTeacher.index]));

        a=new JLabel(new ImageIcon(q));
        s=new JLabel(new ImageIcon(w));
        d=new JLabel(new ImageIcon(r));
        f=new JLabel(new ImageIcon(t));
        g=new JLabel(new ImageIcon(y));
        h=new JLabel(new ImageIcon(u));

        a.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame,"Mr. Rohit Agrawal\nSubject: Operating Systems\nContact Details:\nEmail: rohit.agrwal@gla.ac.in\nContact Number: 7351894030");
            }
        });
        s.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame,"Mr. Ajitesh Kumar\nSubject: Microprocessors\nContact Details:\nEmail: ajitesh.kumar@gla.ac.in\nContact Number: 8726686815");
            }
        });
        d.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame,"Dr. Manas Kumar Mishra\nSubject: Computer Networks\nContact Details:\nEmail: manas.mishra@gla.ac.in\nContact Number: 9956250356");
            }
        });
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame,"Mr. Maneet Singh\nSubject: Discrete Mathematics\nContact Details:\nEmail: maneet.singh@gla.ac.in\nContact Number: 8881010267");
            }
        });
        g.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame,"Mr. Jitesh Kumar Bhatia\nSubject: Object Oriented Programming\nContact Details:\nEmail: jitesh.bhatiya@gla.ac.in\nContact Number: 9997754517");
            }
        });
        h.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame,"Mr. Akhilesh Kumar Singh\nSubject: Data Structures\nContact Details:\nEmail: akhileshvivek@gmail.com\nContact Number: 9792633078");
            }
        });

        a.setBounds(50,100,102,120);
        s.setBounds(220,100,102,120);
        d.setBounds(386,100,102,120);
        f.setBounds(50,286,102,120);
        g.setBounds(220,286,102,120);
        h.setBounds(386,286,102,120);

        background = new ImageIcon("./images\\homeworkbackground.jpg");
        img = background.getImage();
        temp = img.getScaledInstance(600, 600, 4);
        background = new ImageIcon(temp);
        back = new JLabel(background);
        back.setLayout(null);
        back.setBounds(0, 0, 600, 600);

        panel.add(a);panel.add(s);panel.add(d);
        panel.add(f);panel.add(g);panel.add(h);
        panel.add(back);
        frame.add(panel);
        frame.setVisible(true);
    }
}
