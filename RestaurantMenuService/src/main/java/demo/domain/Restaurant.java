package demo.domain;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by vagrant on 7/1/17.
 */
@Data
public class Restaurant {

    @Id
    @GeneratedValue
    Long restaurantId;

    String restaurantName;
}
