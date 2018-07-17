package GLA;

import javax.swing.*;
import java.awt.*;

public class Attendance {
    private JFrame frame;
    private JPanel panel;
    private ImageIcon background;
    private Image img, temp;
    private JLabel back;

    Attendance() {
        frame = new JFrame();
        frame.setSize(600, 560);
        frame.setDefaultCloseOperation(2);
        frame.setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setLayout(null);

        try{
            GetResults.fetchDetails();
        }
        catch (Exception h){
            h.printStackTrace();
        }

        background = new ImageIcon(GetResults.attendance[GetResults.index]);
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
