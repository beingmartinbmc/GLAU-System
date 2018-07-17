package GLA;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Results {
    private JFrame frame;
    private JPanel panel;
    private JLabel q,w,e,r,back;
    private BufferedImage a,s,d,f;
    private ImageIcon background;
    private Image img,temp;

    public Results() {
        frame = new JFrame();
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(2);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        panel = new JPanel();

        background=new ImageIcon("images\\resultbackground.jpg");
        img=background.getImage();
        temp=img.getScaledInstance(400,500,4);
        background=new ImageIcon(temp);
        back=new JLabel(background);
        back.setLayout(null);
        back.setBounds(0,0,400,500);

        panel.setLayout(null);

        try {
            a = ImageIO.read(new File("images\\one.png"));
            s = ImageIO.read(new File("images\\two.png"));
            d = ImageIO.read(new File("images\\three.png"));
            f = ImageIO.read(new File("images\\four.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            GetResults.fetchDetails();
        }
        catch (Exception h){
            h.printStackTrace();
        }
        GetResults.index=StudentLogin.returnIndex(Connectivity.id[Connectivity.index],GetResults.id);

        q = new JLabel(new ImageIcon(a));
        w = new JLabel(new ImageIcon(s));
        e = new JLabel(new ImageIcon(d));
        r = new JLabel(new ImageIcon(f));

        q.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Sem1();
            }
        });
        q.setBounds(150, 50, 64, 64);
        w.setBounds(150,150,64,64);
        w.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Sem2();
            }
        });
        e.setBounds(150,250,64,64);
        e.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Sem3();
            }
        });
        r.setBounds(150,350,64,64);
        r.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Sem4();
            }
        });

        panel.add(q);panel.add(w);panel.add(e);panel.add(r);
        panel.add(back);
        frame.add(panel);
        frame.setVisible(true);
        JOptionPane.showMessageDialog(frame,"Please click on the semester!");
    }
}

class Sem1 {
    private JFrame frame;
    private JPanel panel;
    private ImageIcon background;
    private Image img, temp;
    private JLabel back;

    Sem1() {
        frame = new JFrame();
        frame.setSize(320, 534);
        frame.setDefaultCloseOperation(2);
        frame.setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setLayout(null);

        background = new ImageIcon(GetResults.sem1[GetResults.index]);
        img = background.getImage();
        temp = img.getScaledInstance(300, 534, 4);
        background = new ImageIcon(temp);
        back = new JLabel(background);
        back.setLayout(null);
        back.setBounds(0, 0, 300, 534);

        panel.add(back);
        frame.add(panel);
        frame.setVisible(true);
    }
}
class Sem2{
    private JFrame frame;
    private JPanel panel;
    private ImageIcon background;
    private Image img, temp;
    private JLabel back;

    Sem2() {
        frame = new JFrame();
        frame.setSize(320, 534);
        frame.setDefaultCloseOperation(2);
        frame.setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setLayout(null);

        background = new ImageIcon(GetResults.sem2[GetResults.index]);
        img = background.getImage();
        temp = img.getScaledInstance(300, 534, 4);
        background = new ImageIcon(temp);
        back = new JLabel(background);
        back.setLayout(null);
        back.setBounds(0, 0, 300, 534);

        panel.add(back);
        frame.add(panel);
        frame.setVisible(true);
    }
}
class Sem3{
    private JFrame frame;
    private JPanel panel;
    private ImageIcon background;
    private Image img, temp;
    private JLabel back;

    Sem3() {
        frame = new JFrame();
        frame.setSize(320, 534);
        frame.setDefaultCloseOperation(2);
        frame.setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setLayout(null);

        background = new ImageIcon(GetResults.sem3[GetResults.index]);
        img = background.getImage();
        temp = img.getScaledInstance(300, 534, 4);
        background = new ImageIcon(temp);
        back = new JLabel(background);
        back.setLayout(null);
        back.setBounds(0, 0, 300, 534);

        panel.add(back);
        frame.add(panel);
        frame.setVisible(true);
    }
}
class Sem4{
    private JFrame frame;
    private JPanel panel;
    private ImageIcon background;
    private Image img, temp;
    private JLabel back;

    Sem4() {
        frame = new JFrame();
        frame.setSize(320, 534);
        frame.setDefaultCloseOperation(2);
        frame.setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setLayout(null);

        background = new ImageIcon(GetResults.sem4[GetResults.index]);
        img = background.getImage();
        temp = img.getScaledInstance(300, 534, 4);
        background = new ImageIcon(temp);
        back = new JLabel(background);
        back.setLayout(null);
        back.setBounds(0, 0, 300, 534);
        panel.add(back);
        frame.add(panel);
        frame.setVisible(true);
    }
}