import javax.swing.*;
import java.awt.*;

public class TestDraw {
    public static void main(String[] args) {
        Draw panel = new Draw();
        JFrame frame = new JFrame("Draw");
        JLabel label = new JLabel("Drag the mouse to draw");
        JPanel southPanel = new JPanel();
        label.setFont(new Font("TH-Sarabun-PSK",Font.PLAIN,16));
        southPanel.add(label);
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280,720);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
