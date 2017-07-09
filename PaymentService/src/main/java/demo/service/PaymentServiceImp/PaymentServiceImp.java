package demo.service.PaymentServiceImp;

import demo.domain.Payment;
import demo.domain.PaymentServiceRepository;
import demo.domain.PaymentStatus;
import demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vagrant on 6/29/17.
 */
@Service
public class PaymentServiceImp implements PaymentService{

    private PaymentServiceRepository paymentServiceRepository;

    @Autowired
    public PaymentServiceImp(PaymentServiceRepository paymentServiceRepository) {
        this.paymentServiceRepository = paymentServiceRepository;
    }

    public Payment paymentInfo(Long orderId) {
        return paymentServiceRepository.findByOrderId(orderId);
    }

    public Payment createPayment(Long orderId) {
        return paymentServiceRepository.save(new Payment(orderId));
    }

    public Payment providePaymentInfo(Payment payment) {
        Payment newPayment = paymentInfo(payment.getOrderId());
        newPayment.setCreditCardNumber(payment.getCreditCardNumber());
        newPayment.setCustomerName(payment.getCustomerName());
        newPayment.setCreditCardNumber(payment.getCreditCardNumber());
        newPayment.setExpirationDate(payment.getExpirationDate());
        newPayment.setPaymentStatus(PaymentStatus.PAYED);

        return paymentServiceRepository.save(newPayment);
    }

    public void cancelPayment(Long orderId) {
        Payment newPayment = paymentInfo(orderId);
        newPayment.setPaymentStatus(PaymentStatus.CANCELLED);
    }
}
