package demo.rest;

import demo.domain.FoodItem;
import demo.domain.Restaurant;
import demo.service.RestaurantMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vagrant on 7/1/17.
 */
@RestController
public class RestaurantMenuController {

    private RestaurantMenuService restaurantMenuService;

    @Autowired
    public RestaurantMenuController(RestaurantMenuService restaurantMenuService) {
        this.restaurantMenuService = restaurantMenuService;
    }

    @RequestMapping(value = "/restaurant", method = RequestMethod.GET)
    List<Restaurant> getRestaurants() {
        return restaurantMenuService.getAllRestaurant();
    }

    @RequestMapping(value = "/restaurant", method = RequestMethod.POST)
    void addRestaurants(@RequestBody List<Restaurant> restaurantList) {
        restaurantMenuService.addRestaurants(restaurantList);
    }

    @RequestMapping(value = "/restaurant", method = RequestMethod.DELETE)
    void purge() {
        restaurantMenuService.purge();
    }

    @RequestMapping(value = "/restaurant/{restaurantName}", method = RequestMethod.DELETE)
    void deleteRestaurant(@PathVariable String restaurantName) {
        restaurantMenuService.deleteRestaurant(restaurantName);
    }

    @RequestMapping(value = "/menu/{restaurantName}", method = RequestMethod.GET)
    List<FoodItem> getMenu(@PathVariable String restaurantName) {
        return restaurantMenuService.getMenuFromRestaurant(restaurantName);
    }

    @RequestMapping(value = "/menu", method = RequestMethod.POST)
    void addFoodItems(List<FoodItem> foodItems) {
        restaurantMenuService.addFoodList(foodItems);
    }

    @RequestMapping(value = "/menu/{restaurantName}", method = RequestMethod.DELETE)
    void deleteMenuOfRestaurant(@PathVariable String restaurantName) {
        restaurantMenuService.deleteMenu(restaurantName);
    }

    @RequestMapping(value = "/menu/{restaurantName, foodName}")
    void deleteFoodItemOfRestaurant(String restaurantName, String foodName) {
        restaurantMenuService.deleteFood(restaurantName, foodName);
    }
}
