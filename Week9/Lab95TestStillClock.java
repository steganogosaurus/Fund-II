import javax.swing.*;
import java.awt.*;
public class Lab95TestStillClock {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock");
        Lab95StillClock clock = new Lab95StillClock();
        clock.setSecondHandVisible(true);
        clock.setCurrentTime();
        frame.add(clock);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
