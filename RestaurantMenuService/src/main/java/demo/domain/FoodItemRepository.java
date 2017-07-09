package demo.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by vagrant on 7/1/17.
 */
public interface FoodItemRepository extends PagingAndSortingRepository<FoodItem, Long> {

    List<FoodItem> findByRestaurantName(@Param("restaurantName") String restaurantName);

    void deleteByRestaurantId(@Param("restaurantId") Long restaurantId);

    void deleteByRestaurantNameAndFoodName(@Param("restaurantName") String restaurantName, @Param("foodName") String foodName);
}
