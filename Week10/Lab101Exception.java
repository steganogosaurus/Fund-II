public class Lab101Exception {
    public static void main(String[] args) {
        try {
            int ans= MathDevider1.devider(10, 0);
            System.out.println(ans);
        }catch (ArithmeticException a){
            System.out.println("Error: Divine by zero");
        }
    }
}
class MathDevider1{
    public static int devider(int num1, int num2){
        int result = (int)(num1/num2);
        return result;}
}
