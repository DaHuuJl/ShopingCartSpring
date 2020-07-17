package com.ru.store.service;


import com.ru.store.model.Orders;
import com.ru.store.repository.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class OrdersService {
    private final OrdersRepository ordersRepository;

    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public void createNewOrder(Orders newOrders){
        ArrayList<Orders> ordersArrayList = (ArrayList<Orders>) ordersRepository.findAll();
        if(ordersArrayList.size() < newOrders.getId()){
            ordersRepository.save(newOrders);
        } else
            System.out.println("Такой уже создан");
    }

    public void orderChange(Orders order){
        ordersRepository.save(order);
    }

    public void deleteOrder(Long ordersId){
        ordersRepository.deleteById(ordersId);
    }

    public Orders getOneOrderById(Long ordersId) {
        Optional<Orders> orders  = ordersRepository.findById(ordersId);
        return orders.get();
    }
}
