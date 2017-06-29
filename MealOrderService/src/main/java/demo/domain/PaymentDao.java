package demo.domain;

import lombok.Data;

/**
 * Created by vagrant on 6/29/17.
 */
@Data
public class PaymentDao {

    private Long orderId;
    private Enum<PaymentStatus> paymentStatus;

}
