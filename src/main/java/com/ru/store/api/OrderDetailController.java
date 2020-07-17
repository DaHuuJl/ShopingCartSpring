package com.ru.store.api;

import com.ru.store.model.OrderDetail;
import com.ru.store.service.OrderDetailService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/api/orderDetail",produces = {MediaType.APPLICATION_JSON_VALUE})
public class OrderDetailController {
    private final OrderDetailService orderDetailService;

    public OrderDetailController(OrderDetailService orderDetailService) {
        this.orderDetailService = orderDetailService;
    }

    @RequestMapping(value = "/createOrderDetail", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void createOrderDetail(@RequestBody OrderDetail newOrderDetail){
        orderDetailService.createOrderDetail(newOrderDetail);
    }

    @RequestMapping(value = "/deleteOrderDetail/{orderDetailId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteOrderDetail(@PathVariable("orderDetailId") Long orderDetailId){
        orderDetailService.deleteOrderDetail(orderDetailId);
    }

    @RequestMapping(value = "/getAllOrderDetailByOrderId/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<OrderDetail> getAllOrderDetailByOrderId(@PathVariable("orderId") Long orderId){
        return orderDetailService.getAllOrderDetailByOrderId(orderId);
    }
}
