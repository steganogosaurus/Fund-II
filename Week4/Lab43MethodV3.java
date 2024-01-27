public class Lab43MethodV3 {
    public static void drawSqure(char c , int length){
        for(int i = 0 ; i<length;i++){
            for(int j = 0 ; j<length;j++){
                System.out.printf(" %c ",c);
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        drawSqure('*', 5);
    }
}
