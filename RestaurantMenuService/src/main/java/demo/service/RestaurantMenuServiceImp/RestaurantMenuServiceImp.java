package demo.service.RestaurantMenuServiceImp;

import demo.domain.FoodItem;
import demo.domain.FoodItemRepository;
import demo.domain.Restaurant;
import demo.domain.RestaurantRepository;
import demo.service.RestaurantMenuService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vagrant on 7/1/17.
 */
@Service
public class RestaurantMenuServiceImp implements RestaurantMenuService{

    private RestaurantRepository restaurantRepository;
    private FoodItemRepository foodItemRepository;

    public RestaurantMenuServiceImp(RestaurantRepository restaurantRepository, FoodItemRepository foodItemRepository) {
        this.restaurantRepository = restaurantRepository;
        this.foodItemRepository = foodItemRepository;
    }

    public List<Restaurant> getAllRestaurant() {
        List<Restaurant> list = new ArrayList<>();
        for(Restaurant restaurant : restaurantRepository.findAll()) {
            list.add(restaurant);
        }
        return list;
    }

    public void addRestaurants(List<Restaurant> restaurantList) {
        restaurantRepository.save(restaurantList);
    }

    public void purge() {
        restaurantRepository.deleteAll();
        foodItemRepository.deleteAll();
    }

    public void deleteRestaurant(String restaurantName) {
        restaurantRepository.deleteByRestaurantName(restaurantName);
        foodItemRepository.deleteByRestaurantName(restaurantName);
    }

    public List<FoodItem> getMenuFromRestaurant(String restaurantName) {
        return foodItemRepository.findByRestaurantName(restaurantName);
    }

    public void addFoodList(List<FoodItem> foodItems) {
        foodItemRepository.save(foodItems);
    }

    public void deleteMenu(String restaurantName) {
        foodItemRepository.deleteByRestaurantName(restaurantName);
    }

    public void deleteFood(String restaurantName, String foodName) {
        foodItemRepository.deleteByRestaurantNameAndFoodName(restaurantName, foodName);
    }
}
