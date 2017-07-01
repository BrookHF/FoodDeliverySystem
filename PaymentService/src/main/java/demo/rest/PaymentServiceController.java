package demo.rest;


import demo.domain.Payment;
import demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by vagrant on 6/30/17.
 */
@RestController
public class PaymentServiceController {

    private PaymentService paymentService;

    @Autowired
    public PaymentServiceController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @RequestMapping(value = "/payment/{orderId}", method = RequestMethod.GET)
    public Payment getPayment(@PathVariable Long orderId) {
        return this.paymentService.paymentInfo(orderId);
    }

    @RequestMapping(value = "/payment/{orderId}", method = RequestMethod.POST)
    public Payment createPayment(@PathVariable Long orderId) {
        return this.paymentService.createPayment(orderId);
    }

    @RequestMapping(value = "/payment", method = RequestMethod.PUT)
    public Payment providePaymentInfo(@RequestBody Payment payment) {
        return this.paymentService.providePaymentInfo(payment);
    }

    @RequestMapping(value = "/payment/{orderId}")
    public void cancelPayment(@PathVariable Long orederId) {
        this.paymentService.cancelPayment(orederId);
    }

}
