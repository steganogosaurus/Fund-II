import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Draw extends JPanel
{
    private final ArrayList<Point> points = new ArrayList<>();
    private Point startPoint;
    private int checkStartPoint = 1;
    public Draw()
    {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(checkStartPoint == 1){
                    startPoint = e.getPoint();
                    checkStartPoint--;
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                points.add(e.getPoint());
                repaint();
            }
        });
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Point point : points){
            g.drawLine(startPoint.x, startPoint.y,point.x, point.y);
            startPoint.x = point.x;
            startPoint.y = point.y;
        }

    }
}
