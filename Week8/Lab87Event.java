import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Lab87Event extends JFrame {
    private JTextField t;
    private Font plainFont, boldFont, italicFont, boldItalicFont;
    private JRadioButton plain, bold, italic, boldItalic;
    private JCheckBox check1, check2;
    private int checkBoxHander = 1;

    public Lab87Event() {
        super("RadioButton Test");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
// 1 Text Field
        t = new JTextField("Watch the font style change", 25);
        c.add(t);
// 4 Radio Buttons
        plain = new JRadioButton("Plain", true);
        bold = new JRadioButton("Bold",true );
        italic = new JRadioButton("Italic", true);
        boldItalic = new JRadioButton("Bold/Italic",true );
        c.add(plain);
        c.add(bold);
        c.add(italic);
        c.add(boldItalic);
// 2 check boxes
        check1 = new JCheckBox("Confirm", true);
        check2 = new JCheckBox("Cancle");
        c.add(check1);
        c.add(check2);
// register all controls with 1 handler
        ButtonHandler handler = new ButtonHandler();
        plain.addItemListener(handler);
        bold.addItemListener(handler);
        italic.addItemListener(handler);
        boldItalic.addItemListener(handler);
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(plain);
        radioGroup.add(bold);
        radioGroup.add(italic);
        radioGroup.add(boldItalic);
        ButtonGroup checkboxGroup = new ButtonGroup();
        checkboxGroup.add(check1);
        checkboxGroup.add(check2);
        plainFont = new Font("Times Roman", Font.PLAIN, 14);
        boldFont = new Font("TimesRoman", Font.BOLD, 14);
        italicFont = new Font("TimesRoman", Font.ITALIC, 14);
        boldItalicFont = new Font("TimesRoman", Font.BOLD|Font.ITALIC, 14);
        t.setFont(plainFont);
        // itemListener for check box1 Confirm
        check1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == e.SELECTED) {
                    System.out.print("selected ");
                    checkBoxHander = 1;
                } else
                        System.out.print("de-selected ");
                    System.out.print("Confirm\n");
                }
            }
        );
// itemListener for check box2 Cancle
        check2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == e.SELECTED) {
                    System.out.print("selected ");
                    checkBoxHander = 0;
                } else
                        System.out.print("de-selected ");
                    System.out.print("Cancle\n");
                }
            }
        );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab87Event();
    }

    class ButtonHandler implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (check1.isSelected()){
                    if (e.getSource() == plain)
                        t.setFont(plainFont);
                    else if (e.getSource() == bold)
                        t.setFont(boldFont);
                    else if (e.getSource() == italic)
                        t.setFont(italicFont);
                    else if (e.getSource() == boldItalic)
                        t.setFont(boldItalicFont);
                }
                t.repaint();
            }
        }
    }
}

