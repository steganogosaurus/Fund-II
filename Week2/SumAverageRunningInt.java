import java.util.Scanner;
public class SumAverageRunningInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound value: ");
        int lowerBound = sc.nextInt();
        System.out.print("Enter the upper bound value: ");
        int upperBound = sc.nextInt();
        int sum=0;
        int i=lowerBound;
        float avg;
        do{
            sum+=i;
            i++;
        }while(i<=upperBound);
        avg = sum/(float)upperBound;
        System.out.println("The sum of " + lowerBound + " to " + upperBound + " is " + sum);
        System.out.printf("The average is %.1f ",avg);
    }
}
