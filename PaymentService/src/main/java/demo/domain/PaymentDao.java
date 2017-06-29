package demo.domain;

/**
 * Created by vagrant on 6/29/17.
 */
public class PaymentDao {

    private Long orderId;
    private Enum<PaymentStatus> paymentStatus;

    public enum PaymentStatus {
        PENDING, PAYED, CANCELLED
    }
}
