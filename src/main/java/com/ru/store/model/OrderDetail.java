package com.ru.store.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.JoinColumn;
import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class OrderDetail {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Orders orders;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
    private Double price;
    private Integer quantity;
}
