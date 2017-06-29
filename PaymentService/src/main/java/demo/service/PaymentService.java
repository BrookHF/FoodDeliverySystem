package demo.service;

import demo.domain.Payment;

/**
 * Created by vagrant on 6/29/17.
 */
public interface PaymentService {

    Payment paymentInfo(Long orderId);

    Payment createPayment(Long orderId);

    Payment providePaymentInfo(Payment payment);

    void cancelPayment(Long orderId);
}
