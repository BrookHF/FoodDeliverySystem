package demo.domain;

import lombok.Data;

/**
 * Created by vagrant on 6/27/17.
 */
@Data
public class FoodItem {

    private Long foodId;

    private Long restaurantName;
    private String foodName;
    private double foodPrice;

}
