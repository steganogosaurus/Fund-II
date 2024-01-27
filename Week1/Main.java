import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);
        try{
            System.out.println(args[1]);
        }catch(Exception e){
            System.out.println("");
        }

    }
}