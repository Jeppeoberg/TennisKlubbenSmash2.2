package model;

import model.enums.PaymentStatus;

public class Payment {

    private int memberId;
    private double annualFee;
    private PaymentStatus paymentStatus;

    public Payment(int memberId, double annualFee, PaymentStatus paymentStatus) {

        this.memberId = memberId;
        this.annualFee = annualFee;
        this.paymentStatus = paymentStatus;
    }

    public int getMemberId() {
        return memberId;
    }

    public double getAnnualFee() {
        return annualFee;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    @Override
    public String toString() {
        return memberId + " " + annualFee + " " + paymentStatus;
    }
}
