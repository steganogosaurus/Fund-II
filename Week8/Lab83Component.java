import java.awt.*;
import javax.swing.*;
public class Lab83Component {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setSize(500, 500);
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        Icon icon1 = new ImageIcon("button.png");
        Icon icon2 = new ImageIcon("icon.gif");
        JButton btn1 = new JButton("Button",icon1);
        JLabel label1 = new JLabel("Click here",SwingConstants.RIGHT);
        JLabel label2 = new JLabel("Animation",icon2,SwingConstants.LEFT);
        label1.setForeground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        panel.add(btn1);
        panel.add(label1);
        panel.add(label2);
        frame.add(panel);// Add Panel into Contaniner
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}