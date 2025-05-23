package TheContinental;

import javax.swing.*;
import java.awt.*;

public class Start extends JFrame {
    Start(){
        JLabel label = new JLabel("LOADING...", SwingConstants.CENTER);
        label.setBounds(0, 0, 700,400);
        label.setFont(new Font("Tahoma", Font.BOLD, 50));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        add(label);

        setLayout(null);
        setLocation(300,80);
        setSize(700,400);
        setVisible(true);

        try {
            Thread.sleep(2000);
            new TheContinental.Login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Start();
    }
}
