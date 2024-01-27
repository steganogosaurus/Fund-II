public class CashPayment extends Payment{
    private double tendered;
    CashPayment(double amount,double tendered) {
       super(amount);
       this.tendered = tendered;
    }
    public double getTendered(){
        return this.tendered;
    }
    public double getChange(){
        return getTendered() - getAmount();
    }
    public String toString(){
        return "Amount: "+ getAmount() +" Tendered: " + getTendered() + " Change:"+ getChange();
    }
}
