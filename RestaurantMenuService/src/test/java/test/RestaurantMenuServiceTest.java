package test;

import demo.RestaurantMenuServiceApplication;
import demo.domain.FoodItem;
import demo.domain.Restaurant;
import demo.service.RestaurantMenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by vagrant on 7/6/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestaurantMenuServiceApplication.class)
@WebAppConfiguration
public class RestaurantMenuServiceTest {

    @Autowired
    private RestaurantMenuService service;

    @Test
    public void AddRestaurant() {
        this.service.addRestaurants(Arrays.asList(new Restaurant("yummy")));
        assertThat(this.service.getAllRestaurant().get(0).getRestaurantName()).isEqualTo("yummy");
    }

    @Test
    public void AddFoodItem() {
        this.service.addFoodList(Arrays.asList(new FoodItem("yummy", "salad", 5.0)));
        assertThat(this.service.getMenuFromRestaurant("yummy").get(0).getFoodName()).isEqualTo("salad");
        assertThat(this.service.getMenuFromRestaurant("yummy").get(0).getFoodPrice()).isEqualTo(5.0);
    }
}
