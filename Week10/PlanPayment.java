public class PlanPayment extends Payment{
   private Payment[] payments;
    PlanPayment(double amount, int numberOfInstallments){
        super(amount);
        payments = new Payment[numberOfInstallments];
    }
    public void setInstallment(int installment,Payment payment){
        payments[installment] = payment;
    }
    public Payment getInstallment(int installment){
        return payments[installment];
    }
    public String toString(){
        String planPaymentString = String.format("Amount: %.2f Installments: %d%n",super.getAmount(), this.payments.length);
        for(int payment = 0; payment < payments.length; payment++){
            planPaymentString += String.format("Installment %d: %s%n",payment, getInstallment(payment).toString());
        }
        return planPaymentString;
    }
}
