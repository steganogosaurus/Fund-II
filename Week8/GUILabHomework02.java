import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUILabHomework02 extends JFrame {
    //Create Attribute
    private JCheckBox check1, check2;
    private  JTextField textField1, textField2;
    private JButton button1 , button2;
    private JLabel  label1 , label2;
    public GUILabHomework02(){
        super("GUILabHomework01");
        Container c = getContentPane();
        Color color = new Color(102,205,170);
        Font font1 = new Font("Courier New", Font.BOLD, 20);
        //main statement
        JPanel panel = new JPanel();
        panel.setBackground(color);
        label1 = new JLabel("SwingSwap!!",SwingConstants.CENTER);
        label2 = new JLabel("",SwingConstants.CENTER);
        label1.setFont(font1);
        label2.setFont(font1);
        label1.setPreferredSize(new Dimension(480,50));
        label2.setPreferredSize(new Dimension(480,100));
        //TextField GUI
        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        textField1.setFont(font1);
        textField2.setFont(font1);
        //CheckBox GUI
        check1 = new JCheckBox("Swap");
        check2 = new JCheckBox("Modify on Swap");
        check1.setFont(font1);
        check2.setFont(font1);
        check1.setBackground(color);
        check2.setBackground(color);
        //Button GUI
        button1 = new JButton("Submit");
        button2 = new JButton("Clear");
        button1.setFont(font1);
        button2.setFont(font1);
        //Add panel to Container
        panel.add(label1);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(label2);
        panel.add(check1);
        panel.add(check2);
        panel.add(button1);
        panel.add(button2);
        c.add(panel);
        //Handle Event
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(check1.isSelected() && !check2.isSelected()){
                    label2.setText(textField2.getText() + textField1.getText());
                }else if(check1.isSelected() && check2.isSelected()){
                    String text1 = textField1.getText();
                    String text2 = textField2.getText();
                    textField1.setText(text2);
                    textField2.setText(text1);
                    label2.setText(textField1.getText() + textField2.getText());
                }else{
                    label2.setText(textField1.getText() + textField2.getText());
                }
            }
        });
        //RESET
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(null);
                textField2.setText(null);
                label2.setText(null);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(340, 350);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GUILabHomework02();
    }
}
