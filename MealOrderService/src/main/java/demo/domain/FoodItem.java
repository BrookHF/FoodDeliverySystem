package demo.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.repository.query.Param;

/**
 * Created by vagrant on 7/9/17.
 */
@Data
@Document
public class FoodItem {

    private Long foodId;

    private String foodName;
    private double foodPrice;
    private int quantity;

    public FoodItem() {
    }

    @JsonCreator
    public FoodItem(@Param("foodName") String foodName, @Param("foodPrice") double foodPrice, @Param("quantity")int quantity) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.quantity = quantity;
    }
}
