import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class InoviceTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("1","Max","Avocado");
        Customer customer2 = new Customer("2","Chok","Chok");
        Customer customer3 = new Customer("3","Zig","Zag");
        Customer customer4 = new Customer("4","Harry","Malfoy");

        Invoice invoice1 = new Invoice(customer1.getId(), customer1);
        Invoice invoice2 = new Invoice(customer2.getId(), customer2);
        Invoice invoice3 = new Invoice(customer3.getId(), customer3);
        Invoice invoice4 = new Invoice(customer4.getId(), customer4);
        //Add Product
        Product product1 = new Product("2","Broomstick",100);
        Product product2 = new Product("2","Magic Wand",25);
        Product product3 = new Product("3","Heal Potion",799);
        Product product4 = new Product("4","ButterBeer",30);
        Product product5 = new Product("5","Ramen",75);
        //1
        invoice1.addItem(product1,20);
        invoice1.addItem(product2,10);
        invoice1.addItem(product3,1);
        invoice1.addItem(product4,1);
        //2
        invoice2.addItem(product2,11);
        invoice2.addItem(product4,1);
        invoice2.addItem(product5,2);
        //3
        invoice3.addItem(product1,12);
        invoice3.addItem(product2,8);
        invoice3.addItem(product4,9);
        invoice3.addItem(product3,2);
        invoice3.addItem(product5,3);
        //4
        invoice4.addItem(product1,15);

        CashPayment cashPayment = new CashPayment(invoice2.getTotalPrice(), invoice2.getTotalPrice());
        CreditPayment creditPayment = new CreditPayment(invoice3.getTotalPrice(), "123-456-789");
        PlanPayment planPayment = new PlanPayment(invoice4.getTotalPrice(),2);
        planPayment.setInstallment(0, new CashPayment(120, 120));
        planPayment.setInstallment(1, new CreditPayment(105,"123-456-789"));
        //Payment
        invoice2.setPayment(cashPayment);
        invoice3.setPayment(creditPayment);
        invoice4.setPayment(planPayment);
        //Print
        invoice1.print();
        invoice2.print();
        invoice3.print();
        invoice4.print();
    }
}
