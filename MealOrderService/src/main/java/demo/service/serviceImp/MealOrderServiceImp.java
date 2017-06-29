package demo.service.serviceImp;

import demo.domain.MealOrder;
import demo.domain.MealOrderRepository;
import demo.domain.PaymentDao;
import demo.service.MealOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vagrant on 6/29/17.
 */
@Service
public class MealOrderServiceImp implements MealOrderService {

    private MealOrderRepository mealOrderRepository;

    @Autowired
    public MealOrderServiceImp(MealOrderRepository mealOrderRepository) {
        this.mealOrderRepository = mealOrderRepository;
    }

    public MealOrder orderDetail(Long orderId) {
        return mealOrderRepository.findByOrderId(orderId);
    }

    public MealOrder giveOrder(MealOrder newOrder) {
        return mealOrderRepository.save(newOrder);
    }

    public MealOrder changeOrderPaymentStatus(PaymentDao paymentDao) {
        MealOrder mealOrder = mealOrderRepository.findByOrderId(paymentDao.getOrderId());
        mealOrder.setPaymentStatus(paymentDao.getPaymentStatus());
        return mealOrderRepository.save(mealOrder);
    }

    public MealOrder cancelOrder(Long orderId) {
        return mealOrderRepository.deleteByOrderId(orderId);
    }

    public void purge() {
        mealOrderRepository.deleteAll();
    }
}
