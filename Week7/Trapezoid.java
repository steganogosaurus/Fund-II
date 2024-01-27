public class Trapezoid extends Quadrilateral{
    public Trapezoid(Point p0, Point p1, Point p2, Point p3) {
        super(p0, p1, p2, p3);
    }
    @Override
    public double getArea(){
        double a1 = 0 , a2 = 0 , a3 = 0 , a4 = 0;
        int c1= 0 , c2 = 0;
        for(int i = 0; i < 3 ; i++){
            for(int j = 1 ; j <= 3 ; j++){
                if(super.getEndpoint(i).getY() -  super.getEndpoint(j).getY() != 0){
                    a1 = Math.abs(super.getEndpoint(i).getY() - super.getEndpoint(j).getY());
                }
                if(super.getEndpoint(i).getY() -  super.getEndpoint(j).getY() == 0 && super.getEndpoint(i).getX() -  super.getEndpoint(j).getX() != 0){
                    a1 = Math.abs(super.getEndpoint(i).getX() - super.getEndpoint(j).getX());
                    if(a2 == a3){
                        continue;
                    }

                    a3 = a2;
                    a4 += a2;
                }
            }
        }
        return 0.5*a1*a4;
    }
}
