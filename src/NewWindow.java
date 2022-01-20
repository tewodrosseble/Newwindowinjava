import javax.swing.*;
import java.awt.*;

public class NewWindow extends JFrame{

    public static void showWindow(){
        JLabel label1;
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        JLabel label2 = new JLabel();
        label2.setText("Welcome to the new window");
        label2.setFont(new Font("Serif", 2, 34));

        frame.add(label2, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
