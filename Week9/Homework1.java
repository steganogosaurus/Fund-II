import java.awt.*;
import javax.swing.*;
public class Homework1 extends JPanel {
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        int width = 350, height = 350;
        int xCenter = (getWidth()/2) - (width/2), yCenter = (getHeight()/2) - (height/2);
        Color face = new Color(255, 236, 205);
        System.out.println("X " + xCenter);
        System.out.println("Y " + yCenter);
        System.out.println(getWidth());
        System.out.println(getHeight());
        //draw face
        g.setColor(face);
        g.fillOval(xCenter,yCenter,width,height);
        //draw hat
        g.setColor(Color.red);
        g.fillRect(xCenter+25,yCenter,300,100);
        //draw wingHat
        g.setColor(Color.orange);
        g.fillRect(xCenter,yCenter+90,350,20);
        //draw eye
        g.setColor(Color.BLACK);
        g.fillOval(xCenter+70, yCenter+150, 30, 30);
        g.fillOval(xCenter+250, yCenter+150, 30, 30);
        //draw mouth
        g.fillOval(xCenter+120, yCenter+245, 120, 60);
        g.setColor(face);
        g.fillRect(xCenter+100, yCenter+235, 120, 30);
        g.fillOval(xCenter+100, yCenter+245, 120, 40);
        //draw moustache
        g.setColor(Color.BLACK);
        g.fillRect(xCenter+70, yCenter+240, 70, 10);
        g.fillRect(xCenter+200, yCenter+240, 70, 10);
    }
}
