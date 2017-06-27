package demo.domain;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/**
 * Created by vagrant on 6/27/17.
 */
@Data
public class MealOrder {

    @Id
    @GeneratedValue
    private Long orderId;

    private String customerName;
    private String restaurantName;
    private List<FoodItem> foodItemList;
    private double totalPrice;
    private Date orderTime;
    private String deliveryAddress;
    private Date estimatedDeliveryTime;
    private Enum<PaymentStatus> paymentStatus;

    public enum PaymentStatus {
        PENDING, PAYED, CANCELLED
    }

}
