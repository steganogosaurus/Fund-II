import javax.swing.*;
import java.awt.*;;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class DrawUpgradeHomework extends JPanel {
    private JRadioButton radio1, radio2;
    private ButtonGroup drawSelect;
    private JPanel radioButton;
    private final ArrayList<Point> points = new ArrayList<>();
    private Point startPoint;
    private int checkStartPoint = 1;

    public DrawUpgradeHomework(){
        setLayout(new BorderLayout());
        radioButton = new JPanel();
        radio1 = new JRadioButton("Draw a Line", true);
        radio2 = new JRadioButton("Circle");
        radio1.setFocusable(false);
        radio2.setFocusable(false);
        drawSelect = new ButtonGroup();
        drawSelect.add(radio1);
        drawSelect.add(radio2);
        radioButton.add(radio1);
        radioButton.add(radio2);
        add(radioButton, BorderLayout.SOUTH);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(radio1.isSelected()){
                    if(checkStartPoint == 1){
                        startPoint = e.getPoint();
                        checkStartPoint--;
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (radio1.isSelected()){
                    points.add(e.getPoint());
                    repaint();
                }
            }

        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if(radio2.isSelected()){
                    points.add(e.getPoint());
                    repaint();
                }
            }
        });

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Point point : points) {
            if (radio1.isSelected()) {
                g.drawLine(startPoint.x, startPoint.y, point.x, point.y);
                startPoint.x = point.x;
                startPoint.y = point.y;
            } else {
                g.fillOval(point.x, point.y, 4, 4);
            }
        }
    }
}
