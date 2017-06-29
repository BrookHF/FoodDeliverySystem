package demo.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by vagrant on 6/27/17.
 */
@RepositoryRestResource()
public interface MealOrderRepository extends PagingAndSortingRepository<MealOrder, Long> {

    MealOrder findByOrderId(@Param("orderId") Long orderId);

    MealOrder deleteByOrderId(@Param("orderId") Long orderId);
}
