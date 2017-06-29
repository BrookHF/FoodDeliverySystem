package demo.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by vagrant on 6/29/17.
 */
public interface PaymentServiceRepository extends PagingAndSortingRepository<Payment, Long>{

    Payment findByOrderId(@Param(value = "orderID") Long orderId);

}
