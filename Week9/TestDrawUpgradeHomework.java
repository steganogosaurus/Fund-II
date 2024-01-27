import javax.swing.*;

public class TestDrawUpgradeHomework extends JFrame{
    public TestDrawUpgradeHomework(){
        setTitle("DrawLevelUp");
        add(new DrawUpgradeHomework());
        setSize(1280, 720);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestDrawUpgradeHomework();
    }
}