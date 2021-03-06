package demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by vagrant on 6/27/17.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
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

    public Payment(Long orderId) {
        this.orderId = orderId;
        this.paymentStatus = PaymentStatus.PENDING;
    }
}
