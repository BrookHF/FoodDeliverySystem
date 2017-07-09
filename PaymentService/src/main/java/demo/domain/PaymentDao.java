package demo.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.repository.query.Param;

/**
 * Created by vagrant on 6/29/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class PaymentDao {

    private Long orderId;
    private Enum<PaymentStatus> paymentStatus;

    @JsonCreator
    public PaymentDao(@Param("orderId") Long orderId, @Param("paymentStatus") PaymentStatus paymentStatus) {
        this.orderId = orderId;
        this.paymentStatus = paymentStatus;
    }
}
