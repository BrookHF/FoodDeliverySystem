package demo.domain;

import lombok.Data;

/**
 * Created by vagrant on 6/27/17.
 */
@Data
public class FoodItem {

    private String foodName;
    private double foodPrice;
    private int quantity;

    public FoodItem(String foodName, double foodPrice, int quantity) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.quantity = quantity;
    }


}
