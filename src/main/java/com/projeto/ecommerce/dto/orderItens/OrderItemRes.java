package com.projeto.ecommerce.dto.orderItens;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class OrderItemRes {
    private int quantity;
    private double price;

    public OrderItemRes(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }
}