import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class launcher implements ActionListener {
    JFrame frame1;
    JButton button;
    launcher(){
        JFrame frame1 = new JFrame();
        JButton button1 = new JButton();
        JButton button = new JButton("Open window");
        button.setBounds(100, 160, 200, 40);
        button.addActionListener(this);
        button.setBackground(Color.BLUE);

        frame1.add(button);
        frame1.setLayout(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        frame1.setSize(500,500);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
            NewWindow window = new NewWindow();
            window.showWindow();
    }
}
