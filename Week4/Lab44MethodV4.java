import java.util.Scanner;
public class Lab44MethodV4 {
    public static int findMax(int[] input){
        int max = input[0];
        for(int i = 0; i < input.length; i++) {
            if(input[i] > max)
                max = input[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int n,i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input n : ");
        n = scan.nextInt();
        int [] arr = new int[n];
        for(i = 0 ; i < n ;i++){
            System.out.printf("Input {%d} = ",i+1);
            arr[i] = scan.nextInt();
        }
        System.out.printf("Max is %d",findMax(arr));
    }
}
