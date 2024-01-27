
public class Square extends Quadrilateral {

    public Square(Point p0, Point p1, Point p2, Point p3) {
        super(p0, p1, p2, p3);
    }
    //Constructor สำหรับกำหนด Point ให้ SuperClass
    @Override
    double getArea(){
        double area1 = Math.abs(super.getEndpoint(0).getX() - super.getEndpoint(1).getX());
        double area2 = Math.abs(super.getEndpoint(1).getX() - super.getEndpoint(2).getX());
        if(area2 !=0){
          return Math.pow(area2,2);
        }else{
            return Math.pow(area1,2);
        }
    }
}
