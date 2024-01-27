import java.util.Scanner;
public class Lab48RefReadTwoNumber {
    public static void readTwoInput(AddInt num1,AddInt num2){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter number#1 : ");
        num1.value = scan.nextInt();
        System.out.printf("Enter number#2 : ");
        num2.value = scan.nextInt();
    }
    public static void main(String[] args) {
        AddInt num1 = new AddInt();
        AddInt num2 = new AddInt();
        readTwoInput(num1,num2);
        System.out.printf("Two numbers are {%d} and {%d}",num1.value,num2.value);
    }
}
