import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Lab95StillClock extends JPanel {
    private int hour;
    private int minute;
    private int second;
    private boolean hourHandVisible = true;
    private boolean minuteHandVisible = true;
    private boolean secondHandVisible = true;
    /** Construct a default clock with the current time*/
    public  Lab95StillClock() {
        setCurrentTime();
    }
    /** Construct a clock with specified hour, minute, and second */
    public  Lab95StillClock (int hour, int minute, int second){
        this.hour  = hour;
        this.minute = minute;
        this.second = second;
    }
    /** Return hour */
    public int getHour () {
        return hour;
    }
    /** Set a new hour */
    public void setHour (int hour) {
        this.hour =  hour;
        repaint();
    }
    /** Return minute */
    public int getMinute() {
        return minute;
    }
    /** Set a new minute */
    public void setMinute (int minute) {
        this.minute =  minute;
        repaint();
    }
    /** Return second */
    public int getSecond () {
        return second;
    }
    /** Set a new second */
    public void setSecond (int second) {
        this.second = second;
        repaint();
    }
    /** Draw the clock */
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        // Initialize clock parameters
        int clockRadius = (int) (Math.min(getWidth(), getHeight()) * 0.8 * 0.5);
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        // Draw circle
        g.setColor(Color.black);
        g.drawOval(xCenter - clockRadius, yCenter - clockRadius, 2 * clockRadius, 2 * clockRadius);
        // Draw Minute Hour Line
        int angle=0;
        int count = 2;
        for(int i =0; i<60; i++){
            double x1 = xCenter+(clockRadius*(Math.cos(Math.toRadians(angle))));
            double y1 = yCenter+(clockRadius*(Math.sin(Math.toRadians(angle))));
            double x2 = xCenter+((clockRadius-10)*(Math.cos(Math.toRadians(angle))));
            double y2 = yCenter+((clockRadius-10)*(Math.sin(Math.toRadians(angle))));
            g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
            if(angle %30 == 0){
                x2 = xCenter+((clockRadius-15)*(Math.cos(Math.toRadians(angle))));
                y2 = yCenter+((clockRadius-15)*(Math.sin(Math.toRadians(angle))));
                g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
                count+=1;
                int xNumber = (int)(xCenter+((clockRadius-25)*(Math.cos(Math.toRadians(angle)))));
                int yNumber = (int)(yCenter+((clockRadius-25)*(Math.sin(Math.toRadians(angle)))));
                g.drawString(String.valueOf(count),xNumber,yNumber);
                if(count == 12){
                    count=0;
                }
            }
            else {
                g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
            }
            angle +=6;
        }
        // Draw second hand
        if (secondHandVisible) {
            int sLength = (int) (clockRadius * 0.8);
            int xSecond = (int) (xCenter + sLength * Math.sin(second * (2 * Math.PI / 60)));
            int ySecond = (int) (yCenter - sLength * Math.cos(second * (2 * Math.PI / 60)));
            g.setColor(Color.red);
            g.drawLine(xCenter, yCenter, xSecond, ySecond);
        }
        // Draw minute hand
        if (minuteHandVisible) {
            int mLength = (int)(clockRadius * 0.65);
            int xMinute = (int)(xCenter + mLength *Math.sin(minute * (2 * Math.PI / 60)));
            int yMinute = (int)(yCenter -mLength *Math.cos(minute * (2 * Math.PI / 60)));
            g.setColor(Color.blue);
            g.drawLine(xCenter, yCenter, xMinute, yMinute);
        }
        // Draw hour hand
        if (hourHandVisible) {
            int hLength = (int)(clockRadius * 0.5);
            int xHour = (int)(xCenter + hLength *Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
            int yHour = (int)(yCenter -hLength *Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
            g.setColor(Color.green);
            g.drawLine(xCenter, yCenter, xHour, yHour);
        }
    }
    public void setCurrentTime(){
        // Construct a calendar for the current date and time
        Calendar calendar = new GregorianCalendar();
        // Set current hour, minute and second
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }
    public Dimension getPreferredSize(){
        return new Dimension(200, 200);
    }
    public boolean isHourHandVisible() {
        return hourHandVisible;
    }
    public boolean isMinuteHandVisible(){
        return hourHandVisible;
    }
    public boolean isSecondHandVisible(){
        return secondHandVisible;
    }
    public void setHourHandVisible(boolean hourHandVisible){
        this.hourHandVisible = hourHandVisible;
        repaint();
    }
    public void setMinuteHandVisible(boolean minuteHandVisible){
        this.minuteHandVisible = minuteHandVisible;
        repaint();
    }
    public void setSecondHandVisible(boolean secondHandVisible){
        this.secondHandVisible = secondHandVisible;
        repaint();
    }
}