package demo.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/**
 * Created by vagrant on 6/27/17.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class MealOrder {

    @Id
    @GeneratedValue
    private Long orderId;

    private String customerName;
    private String restaurantName;
    private List<FoodItemDao> foodItemList;
    private double totalPrice;
    private Date orderTime;
    private String deliveryAddress;
    private Date estimatedDeliveryTime;
    private Enum<PaymentStatus> paymentStatus;

    public MealOrder() {
    }

    public MealOrder(String customerName) {
        this.customerName = customerName;
    }
}
