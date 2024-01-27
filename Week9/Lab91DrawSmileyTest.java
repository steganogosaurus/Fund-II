import javax.swing.*;
public class Lab91DrawSmileyTest {
    public static void main(String[] args) {
        Lab91DrawSmiley drawSmiley = new Lab91DrawSmiley();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(drawSmiley);
        frame.setSize(240,260);
        frame.setVisible(true);
    }
}
