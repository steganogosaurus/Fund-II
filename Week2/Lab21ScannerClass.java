import java.util.Scanner;
public class Lab21ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:");
            String nameStudent = sc.nextLine();
        System.out.print("Enter ID:");
            String id = sc.next();
        System.out.print("Enter Birthday (dd/mm/yyyy):");
            String birthday = sc.next();
        System.out.print("Enter Age:");
            String age = sc.next();
        System.out.print("Enter GPA:");
            double grade = sc.nextDouble();
        System.out.println("\n" + "My Name is " + nameStudent + "\n");
        System.out.print("Birthday: " + birthday + "\t");
        System.out.println("Age: " + age + "\n");
        System.out.print("ID: " + id + "\t");
        System.out.println("GPA: " + grade);
    }
}
