package com.ru.store.model;

import com.ru.store.model.enams.Order_status;
import com.ru.store.model.enams.Payment_method;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate order_date;
    @Enumerated(EnumType.STRING)
    private Order_status order_status;
    @Enumerated(EnumType.STRING)
    private Payment_method payment_method;
    //@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @JsonIgnore
    @OneToMany(mappedBy ="orders", fetch = FetchType.EAGER)
    private List<OrderDetail> orderDetailList;
}
