package demo.domain;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by vagrant on 6/27/17.
 */
@Data
public class Payment {

    @Id
    @GeneratedValue
    private Long paymentId;

    private Long orderId;
    private String customerName;
    private String creditCardNumber;
    private String expirationDate;
    private String securityCode;
    private Enum<PaymentStatus> paymentStatus;
    private Date transitionTime;

    public enum PaymentStatus {
        PENDING, PAYED, CANCELLED
    }
}
