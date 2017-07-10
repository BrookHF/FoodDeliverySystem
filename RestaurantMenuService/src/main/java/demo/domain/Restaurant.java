package demo.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    private Long restaurantId;

    private String restaurantName;

    public Restaurant() {
    }

    @JsonCreator
    public Restaurant(@JsonProperty("restaurantName") String restaurantName) {
        this.restaurantName = restaurantName;
    }
}
