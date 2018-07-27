package GLA.student;

import GLA.backend.ConnectResults;

import javax.swing.*;
import java.awt.*;

public class Attendance {
    private JFrame frame;
    private JPanel panel;
    private ImageIcon background;
    private Image img, temp;
    private JLabel back;

    public Attendance() {
        frame = new JFrame();
        frame.setSize(600, 560);
        frame.setDefaultCloseOperation(2);
        frame.setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setLayout(null);

        try{
            ConnectResults.fetchDetails();
        }
        catch (Exception h){
            h.printStackTrace();
        }

        background = new ImageIcon(ConnectResults.attendance[ConnectResults.index]);
        img = background.getImage();
        temp = img.getScaledInstance(600, 500, 4);
        background = new ImageIcon(temp);
        back = new JLabel(background);
        back.setLayout(null);
        back.setBounds(0, 0, 600, 560);
        panel.add(back);
        frame.add(panel);
        frame.setVisible(true);
    }
}