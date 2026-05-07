package Enum;

public class PaymentStatus {
    private int memberId;
    private double annualFee;
    private boolean paymentComplete;
    //private LocalDate paymentDate;  Vi gemmer det til senere

    public PaymentStatus(int memberId, double annualFee) {
        this.paymentComplete = false;
        this.annualFee = annualFee;
        this.memberId = memberId;
    }

    public void setPaymentComplete(boolean b) {
        this.paymentComplete = b;
    }


    public double getAmountDue() {
        return this.annualFee;
    }
}
