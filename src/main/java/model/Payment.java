package model;

import java.time.LocalDate;

public class Payment {
    private int memberId;
    private double annualFee;
    private PaymentStatus paymentStatus;
    private LocalDate paymentDate;

    public void markAsPaid(LocalDate paymentDate) {

    }

    public boolean isPaid() {

    }

    public double getAmountDue() {
        return this.annualFee;
    }
}
