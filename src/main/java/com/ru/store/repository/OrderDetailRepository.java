package com.ru.store.repository;

import com.ru.store.model.OrderDetail;
import com.ru.store.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.ArrayList;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    ArrayList<OrderDetail> findAllByOrders(Orders orders);
}
