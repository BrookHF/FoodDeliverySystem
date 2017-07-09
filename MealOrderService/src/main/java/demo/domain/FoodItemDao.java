package demo.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.repository.query.Param;

/**
 * Created by vagrant on 7/9/17.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FoodItemDao {

    private Long foodId;

    private String foodName;
    private double foodPrice;
    private int quantity;

    public FoodItemDao() {
    }

    @JsonCreator
    public FoodItemDao(@Param("foodName") String foodName, @Param("foodPrice") double foodPrice, @Param("quantity")int quantity) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.quantity = quantity;
    }
}
