package demo.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by vagrant on 7/1/17.
 */
public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, Long> {



    void deleteByRestaurantName(@Param("restaurantName") String restaurantName);
}
