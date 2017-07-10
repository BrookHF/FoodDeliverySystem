package demo.domain;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by vagrant on 6/27/17.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
@RequiredArgsConstructor(onConstructor = @__(@PersistenceConstructor))
@Document
public class MealOrder {

    @Id
    private String orderId;

    private String customerName;
    private String restaurantName;
    private List<FoodItem> foodItemList;
    private double totalPrice;
    private Date orderTime;
    private String deliveryAddress;
    private Date estimatedDeliveryTime;
    private Enum<PaymentStatus> paymentStatus;

    @JsonCreator
    public MealOrder(@JsonProperty("customerName") String customerName) {
        this.customerName = customerName;
    }
}
