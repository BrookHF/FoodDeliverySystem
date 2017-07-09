package demo.rest;

import demo.domain.MealOrder;
import demo.domain.PaymentDao;
import demo.service.MealOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MealOrderController {

    private MealOrderService mealOrderService;

    @Autowired
    public MealOrderController(MealOrderService mealOrderService) {
        this.mealOrderService = mealOrderService;
    }

    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.GET)
    public MealOrder orderDetail(@PathVariable Long orderId) {
        return mealOrderService.orderDetail(orderId);
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public MealOrder giveOrder(@RequestBody MealOrder mealOrder) {
        return mealOrderService.giveOrder(mealOrder);
    }

    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.PUT)
    public MealOrder changPaymentStatus(@RequestBody PaymentDao paymentDao) {
        return mealOrderService.changeOrderPaymentStatus(paymentDao);
    }

    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.DELETE)
    public MealOrder deleteOrder(@PathVariable Long orderId) {
        return mealOrderService.cancelOrder(orderId);
    }

    @RequestMapping(value = "/order", method = RequestMethod.DELETE)
    public void purge() {
        mealOrderService.purge();
    }

}
