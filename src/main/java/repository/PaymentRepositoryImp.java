package repository;

import model.Payment;
import repository.interfaces.PaymentRepository;

import java.util.ArrayList;
import java.util.List;

public class PaymentRepositoryImp implements PaymentRepository {
    private List<Payment> payments = new ArrayList<>();

    @Override
    public void addPayment(Payment payment) {

        payments.add(payment);
    }

    @Override
    public List<Payment> getAllPayments() {
        return payments;
    }
}
