import java.awt.*;
import javax.swing.*;
public class Lab85Layout extends JFrame{
    public Lab85Layout() {
        super("Application");
        Container c = getContentPane();
        //  panel 1: vertical box layout
        JPanel p1 = new JPanel();
        p1.setLayout( new BoxLayout(p1, BoxLayout.Y_AXIS));
        JCheckBox check1 = new JCheckBox("Add Matrix");
        JCheckBox check2 = new JCheckBox("Upgrade Matrix");
        JCheckBox check3 = new JCheckBox("Cancle Matrix");
        p1.add(check1);
        p1.add(check2);
        p1.add(check3);

        // panel 2: vertical box vvvvvvvvv
        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
        JButton btn1= new JButton("Ok");
        JButton btn2 = new JButton("Cancel");
        p2.add(btn1);
        p2.add(btn2);
        // Label 1 : Center Application
        JLabel label1 = new JLabel( new ImageIcon(((new ImageIcon("C:\\Users\\zignalssPC\\Desktop\\1.png")).getImage()).getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH)));
        // add panels and image to framec.
        add(p1, BorderLayout.WEST);
        c.add(label1, BorderLayout.CENTER);
        c.add(p2, BorderLayout.EAST);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setResizable(false);   // disable window resizing
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Lab85Layout();

    }
}