package com.projeto.ecommerce.dto.orders;

import com.projeto.ecommerce.entities.PaymentEntity;
import com.projeto.ecommerce.entities.UserEntity;
import com.projeto.ecommerce.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class OrderRes {
    private UUID id;
    private UserEntity client;
    private LocalDate moment;
    private OrderStatus status;
    private PaymentEntity payment;

    public OrderRes(UserEntity client) {
    }
}