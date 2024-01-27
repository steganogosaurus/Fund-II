import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LayoutManagement extends JFrame{
    private JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private String [] btnName = {"Cls", "Bck", "", "Close", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
    public LayoutManagement(){
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setLayout(new BorderLayout());
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 50));
        Font font = new Font("TH-Sarabun-PSK", Font.PLAIN, 30);
        textField.setFont(font);

        panel = new JPanel(new GridLayout(5,4,5,5));
        for(int i = 0; i < 20; i++){
            JButton button = new JButton(btnName[i]);
            button.setFocusable(false);
            if(btnName[i].equals("")){
                panel.add(button);
                button.setEnabled(false);
                button.setBorderPainted(false);
            }else {
                panel.add(button);
            }
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton currentButton = (JButton)e.getSource();
                    String buttonName = currentButton.getText();
                    if(buttonName.equals("Cls")){
                        textField.setText("");
                    }else {
                        textField.setText(buttonName);
                    }
                }
            });
        }
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutManagement();
    }
}