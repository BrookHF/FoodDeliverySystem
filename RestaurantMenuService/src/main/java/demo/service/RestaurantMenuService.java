package demo.service;

import demo.domain.FoodItem;
import demo.domain.Restaurant;

import java.util.List;

/**
 * Created by vagrant on 7/1/17.
 */
public interface RestaurantMenuService {

    List<Restaurant> getAllRestaurant();

    void addRestaurants(List<Restaurant> restaurantList);

    void purge();

    void deleteRestaurant(String restaurantName);

    List<FoodItem> getMenuFromRestaurant(String restaurantName);

    void addFoodList(List<FoodItem> foodItems);

    void deleteMenu(String restaurantName);

    void deleteFood(String restaurantName, String foodName);
}
