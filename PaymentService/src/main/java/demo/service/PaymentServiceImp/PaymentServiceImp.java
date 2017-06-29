package demo.service.PaymentServiceImp;

import demo.domain.Payment;
import demo.domain.PaymentServiceRepository;
import demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by vagrant on 6/29/17.
 */
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
        return null;
    }

    public void cancelPayment(Long orderId) {

    }
}
