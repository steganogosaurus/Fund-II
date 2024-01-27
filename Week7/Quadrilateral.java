import java.util.ArrayList;
public class Quadrilateral extends Point{
    private ArrayList<Point> endpoint = new ArrayList<Point>();
    //สร้างAttribute
    public Quadrilateral(Point p0, Point p1, Point p2, Point p3){
        this.endpoint.add(p0);
        this.endpoint.add(p1);
        this.endpoint.add(p2);
        this.endpoint.add(p3);
    }
    double getArea(){
        return 0.0;
    }
    Point getEndpoint(int index){
        return this.endpoint.get(index);
    }
    //Getter สำหรับ return ค่าในตำเเหน่ง Index
}
