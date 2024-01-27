import java.awt.*;
import javax.swing.*;
public class Lab92PaintPanelTest
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Paint Applications");
        JLabel message = new JLabel("Drag the mouse to draw");
        message.setFont(new Font("Monospace",Font.BOLD|Font.ITALIC,30));
        Lab92PaintPanel panel1 = new Lab92PaintPanel();
        JPanel panel2 = new JPanel();
        panel2.add(message);
        frame.add(panel1,BorderLayout.CENTER);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.setSize(800,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}