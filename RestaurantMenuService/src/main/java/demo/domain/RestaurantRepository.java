package demo.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by vagrant on 7/1/17.
 */
public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, Long> {

    void deleteByRestaurantId(@Param("restaurantId") Long restaurantId);

    List<Restaurant> findByRestaurantName(@Param("restaurantName") String restaurantName);
}
