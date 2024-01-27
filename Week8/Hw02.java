import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;

public class Hw02 extends JFrame{
    private JTextField textField1 , textField2;
    private JCheckBox checkBox1  , checkBox2;
    private JLabel label;
    private JButton button1 , button2;

    public Hw02(){
        super( "GUI02" );
        Container c = getContentPane();


        Font font = new Font("Courier New",Font.BOLD,15);
        JPanel pa = new JPanel();
        checkBox1 = new JCheckBox("Swap");
        checkBox2 = new JCheckBox(" Modify on Swap");
        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        button1 = new JButton("Submit");
        button2 = new JButton("Clear");

        checkBox1.setFont(font);
        checkBox2.setFont(font);
        textField1.setFont(font);
        textField2.setFont(font);
        button1.setFont(font);
        button2.setFont(font);


        pa.add(textField1);
        pa.add(textField2);
        pa.add(button1);
        pa.add(button2);
        pa.add(checkBox1);
        pa.add(checkBox2);
        pa.setBackground(Color.BLACK);

        c.add(pa);
        pack();
        // c.setBackground(Color.BLACK);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(380,  400);
        setVisible(true);




    }
    public static void main(String[] args) {
        new Hw02();
    }
}