package demo.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by vagrant on 6/27/17.
 */
public interface MealOrderRepository extends PagingAndSortingRepository<MealOrder, String> {

    MealOrder findByOrderId(@Param("orderId") String orderId);

    MealOrder deleteByOrderId(@Param("orderId") String orderId);
}
