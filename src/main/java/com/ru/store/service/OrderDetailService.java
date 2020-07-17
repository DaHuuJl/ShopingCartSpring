package com.ru.store.service;

import com.ru.store.model.OrderDetail;
import com.ru.store.model.Orders;
import com.ru.store.model.Product;
import com.ru.store.repository.OrderDetailRepository;

import com.ru.store.repository.OrdersRepository;
import com.ru.store.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderDetailService {
    public final OrderDetailRepository orderDetailRepository;
    public final OrdersRepository ordersRepository;
    public final ProductRepository productRepository;

    public OrderDetailService(OrderDetailRepository orderDetailRepository, OrdersRepository ordersRepository, ProductRepository productRepository) {
        this.orderDetailRepository = orderDetailRepository;
        this.ordersRepository = ordersRepository;
        this.productRepository = productRepository;
    }

    public void createOrderDetail(OrderDetail newOrderDetail) {
        if(orderDetailRepository.findAll().size() < newOrderDetail.getId()) {
            OrderDetail orderDetail = newOrderDetail;
            Product product = productRepository.findById(newOrderDetail.getProduct().getId()).get();
            orderDetail.setPrice(product.getPrice());
            orderDetailRepository.save(orderDetail);
        } else
            System.out.println("Такой уже создан");
    }

    public void deleteOrderDetail(Long orderDetailId) {
        orderDetailRepository.deleteById(orderDetailId);
    }

    public ArrayList<OrderDetail> getAllOrderDetailByOrderId(Long orderId) {
        Orders orders = ordersRepository.findById(orderId).get();
        return orderDetailRepository.findAllByOrders(orders);
    }

}
