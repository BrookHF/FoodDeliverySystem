package demo.domain;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by vagrant on 6/27/17.
 */
@Data
public class FoodItem {

    @Id
    @GeneratedValue
    private Long foodId;

    private Long restaurantName;
    private String foodName;
    private double foodPrice;

}
