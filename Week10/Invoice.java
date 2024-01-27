import java.util.ArrayList;
public class Invoice {
    private Payment payment = null;
    private String id;
    private Customer customer = new Customer();
    private ArrayList<LineItem> items = new ArrayList<LineItem>();
    //สร้างAttributes
    public Invoice(){
    }
    public Invoice(String id ,Customer customer){
        this.id = id;
        this.customer = customer;
    }
    public void addItem(Product product,int quantity){
        LineItem item = new LineItem(product,quantity);
        this.items.add(item) ;
    }
    public void setPayment(Payment payment){
        this.payment = payment;
    }
    public String getId(){
        return this.id;
    }
    public Customer getCustomer(){
        return this.customer;
    }
    public LineItem getLineItem(int i){
        return this.items.get(i);
    }
    public Payment getPayment(){
        return this.payment;
    }
    public double getTotalPrice(){
       double totalPrice = 0.0;
        for (LineItem a:this.items){
            totalPrice += a.getTotalPrice();

        }
       return totalPrice;
    }
    public void print(){
        int invoiceNumber = 1;
        System.out.printf("INVOICE: #%s%nCUSTOMER: %s %s%n%nITEMS:%n",getId(),getCustomer().getFirstName(),getCustomer().getLastName());
        for(LineItem amountInvoice : this.items){
            System.out.printf("%d. %s x %s = %.2f%n",invoiceNumber,amountInvoice.getProduct().getName(),amountInvoice.getQuantity(),amountInvoice.getTotalPrice());
            invoiceNumber++;
        }
        System.out.printf("TOTAL : %.2f%n%s%n%n",getTotalPrice(), getPayment());
    }
}
