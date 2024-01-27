public class CreditPayment extends Payment{
    private String cardNumber;

    CreditPayment(double amount,String cardNumber){
        super(amount);
        this.cardNumber = cardNumber;
    }
    public String getCardNumber(){
        return this.cardNumber;
    }
    public String toString(){
        return "Amount: " + getAmount() + " Card Number: " + getCardNumber();
    }
}
