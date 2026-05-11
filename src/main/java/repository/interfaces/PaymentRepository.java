package repository.interfaces;

import model.Payment;
import java.util.List;

public interface PaymentRepository {

    void addPayment(Payment payment);

    List<Payment> getAllPayments();
}
