package demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by vagrant on 7/1/17.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Restaurant {

    @Id
    @GeneratedValue
    Long restaurantId;

    String restaurantName;

    public Restaurant() {
    }

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}
