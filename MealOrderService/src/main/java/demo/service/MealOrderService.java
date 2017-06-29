package demo.service;

import demo.domain.MealOrder;
import demo.domain.PaymentDao;

/**
 * Created by vagrant on 6/29/17.
 */
public interface MealOrderService {

    MealOrder orderDetail(Long orderId);

    MealOrder giveOrder(MealOrder newOrder);

    MealOrder changeOrderPaymentStatus(PaymentDao paymentDao);

    MealOrder cancelOrder(Long orderId);

    void purge();

}
