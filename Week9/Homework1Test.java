import javax.swing.*;
public class Homework1Test {
    public static void main(String[] args) {
        Homework1 drawSmiley = new Homework1();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(drawSmiley);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}
