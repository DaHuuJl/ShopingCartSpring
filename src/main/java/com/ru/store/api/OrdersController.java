package com.ru.store.api;

import com.ru.store.model.Orders;
import com.ru.store.repository.OrdersRepository;
import com.ru.store.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/orders",produces = {MediaType.APPLICATION_JSON_VALUE})
public class OrdersController {
    private final OrdersService ordersService;
    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersController(OrdersService ordersService, OrdersRepository ordersRepository){
        this.ordersService = ordersService;
        this.ordersRepository = ordersRepository;
    }

    @RequestMapping(value = "/createNewOrder", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void createNewOrder(@RequestBody Orders newOrders){
        ordersService.createNewOrder(newOrders);
    }

    @RequestMapping(value = "/deleteOrder/{orderId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteOrder(@PathVariable("orderId") Long orderId){
        ordersService.deleteOrder(orderId);
    }

    @RequestMapping(value = "/editOrder", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void editOrder(@RequestBody Orders orders){
        ordersService.orderChange(orders);
    }

    @RequestMapping(value = "/getOneOrderById/{orderId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Orders getOneOrderById(@PathVariable("orderId") Long ordersId){
        return ordersService.getOneOrderById(ordersId);
    }
}
