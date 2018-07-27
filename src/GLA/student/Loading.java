package GLA.student;

import javax.swing.*;

class MyThread extends Thread{
    @Override
    public void run(){
        new Loading();
        Loading.panel.add(Loading.f);
        Loading.frame.add(Loading.panel);
        Loading.frame.setVisible(true);
    }
}

class MyAnotherThread extends Thread{
    @Override
    public void run(){
        MyThread t=new MyThread();
        try {
            t.join();
            t.start();
            Thread.currentThread().sleep(4000);
            new Dashboard();
            Loading.frame.dispose();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class Loading{
    public static JFrame frame;
    public static JPanel panel;
    static Icon b;
    public static JLabel f;

    public Loading(){
        frame=new JFrame();
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(2);
        panel=new JPanel();
        b= new ImageIcon("./images\\loading.gif");
        f = new JLabel(b);
    }
}