package demo.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by vagrant on 6/27/17.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class FoodItem {

    @Id
    @GeneratedValue
    private Long foodId;

    private String restaurantName;
    private String foodName;
    private double foodPrice;

    public FoodItem() {
    }

    @JsonCreator
    public FoodItem(@JsonProperty("restaurantName") String restaurantName, @JsonProperty("foodName") String foodName, @JsonProperty("foodPrice") double foodPrice) {
        this.restaurantName = restaurantName;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }
}