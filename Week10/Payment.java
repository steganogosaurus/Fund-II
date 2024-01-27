abstract public class Payment {    //Abstract class
    private double amount;
    Payment(double amount){
        if(amount < 0)
            amount = 0;
    }
    public double getAmount(){
        return this.amount;
    }
}
