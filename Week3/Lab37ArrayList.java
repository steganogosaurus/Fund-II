import java.util.ArrayList;
import java.util.Scanner;
public class Lab37ArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> arryList = new ArrayList<String>();
        arryList.add("Paul");
        arryList.add("Pete");
        arryList.add("John");
        arryList.add("George");
        System.out.println(arryList);
        arryList.remove(1);
        System.out.println(arryList);
        System.out.println("At Index 1 : Ringo");
        arryList.add(1,"Ringo");
        System.out.println(arryList);
        System.out.println("Edit name John -> Johny");
        arryList.set(2,"Johny");
        System.out.println("Size of the band: " + arryList.size());
        for(String i : arryList) {
            System.out.println(i);
        }
    }
}
