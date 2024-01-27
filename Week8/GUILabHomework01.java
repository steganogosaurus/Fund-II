import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUILabHomework01 extends JFrame{
    public GUILabHomework01(){
        super("GUILabHomework01");
        Container c = getContentPane();
        JPanel panel = new JPanel();
        JTextField textField = new JTextField(35);
        Color color = new Color(240,255,255);
        JButton button = new JButton("Clear");
        Font font1 = new Font("Courier New", Font.BOLD, 20);
        textField.setFont(font1);
        button.setFont(font1);
        panel.setBackground(color);
        panel.add(textField);
        panel.add(button);
        c.add(panel);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField.getText() == null || textField.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                }else {
                        System.out.println(textField.getText());
                        JOptionPane.showMessageDialog(null, textField.getText());
                }
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    textField.setText(null);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GUILabHomework01();
    }
}
