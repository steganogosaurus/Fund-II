import java.util.Scanner;
public class Lab5DoWhile {
    public static void main(String[] args) {
        int i, N;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : ");
        N = scan.nextInt();
        i = 5;
        do{
            System.out.println(i);
            i--;
        }while( i >= 1);
    }
}
