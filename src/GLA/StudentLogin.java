package GLA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class StudentLogin {
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel a,b,x,back;
    private static JTextField c;
    private static JPasswordField d;
    private ImageIcon background;
    private Image img,temp;

    public StudentLogin(){
        frame=new JFrame();
        frame.setSize(500,600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        panel=new JPanel();
        panel.setLayout(null);

        background=new ImageIcon("images\\background.jpg");
        img=background.getImage();
        temp=img.getScaledInstance(500,600, Image.SCALE_SMOOTH);
        background=new ImageIcon(temp);
        back=new JLabel(background);
        back.setLayout(null);
        back.setBounds(0,0,500,600);


        a=new JLabel();
        a.setIcon(new ImageIcon("images\\user.png"));
        c=new JTextField(10);
        c.setFont(new Font("Dubai",Font.PLAIN,15));
        d=new JPasswordField(10);
        b=new JLabel();
        b.setIcon(new ImageIcon("images\\pass.png"));
        c=new JTextField(10);
        c.setFont(new Font("Dubai",Font.PLAIN,15));
        d=new JPasswordField(10);
        x=new JLabel();
        x.setIcon(new ImageIcon("images\\key.png"));

        a.setBounds(50,100,128,128);
        c.setBounds(190,140,200,30);
        b.setBounds(50,250,128,128);
        d.setBounds(190,300,200,30);
        x.setBounds(170,400,128,128);

        x.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    String username=c.getText();
                    String password = Arrays.toString(d.getPassword()).replaceAll("\\[|\\]|,|\\s", "");
                    Connectivity.fetchDetails();
                    if(search(username,Connectivity.id)&&search(password,Connectivity.password)){
                        Connectivity.index=returnIndex(username,Connectivity.id);
                        MyAnotherThread t=new MyAnotherThread();
                        t.start();
                        frame.dispose();
                    }}
                catch (Exception z){
                    z.printStackTrace();
                }
            }
        });

        panel.add(a);panel.add(b);panel.add(c);panel.add(d);
        panel.add(x);panel.add(back);
        frame.add(panel);
        frame.setVisible(true);
    }
     static boolean search(String s,String a[]){
        int c=0;
        for(String w:a){
            if(w.equals(s)) {
                c = 0;
                break;
            }
            else
                c=1;
        }
        if(c==0)
            return true;
        else return false;
    }
     public static int returnIndex(String s,String a[]) {
        int p = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(s)) {
                p = i;
                break;
            }
        }
        return p;
    }
}