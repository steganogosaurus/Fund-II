public class Parallelogram extends Quadrilateral{
    public Parallelogram(Point p0, Point p1, Point p2, Point p3) {
        super(p0, p1, p2, p3);
    }
    //Constructor สำหรับกำหนดPoint
    @Override
    public double getArea(){
        int c = 0;
        double a1 = 0 , a2 = 0;
        for(int i = 0 ; i < 3 ; i++){
            if(super.getEndpoint(i).getY() -  super.getEndpoint(i+1).getY() != 0){
                a1 = Math.abs(super.getEndpoint(i).getY() - super.getEndpoint(i+1).getY());
                c = i;
            }
            //หาเส้นในเเนวเเกนY
            if(super.getEndpoint(i).getX() -  super.getEndpoint(i+1).getX() != 0 && i != c){
                a1 = Math.abs(super.getEndpoint(i).getX() - super.getEndpoint(i+1).getX());
            }
            //หาเส้นในเเนวเเกนY
        }
        return a1*a2;
    }
}
