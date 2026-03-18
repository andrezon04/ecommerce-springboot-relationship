package com.projeto.ecommerce.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderItemEntity {

    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    private int quantity;
    private double price;

    public OrderItemEntity(OrderEntity order, ProductEntity product, OrderItemPK id, int quantity, double price) {
        id.setOrderEntity(order);
        id.setProductEntity(product);
        this.quantity = quantity;
        this.price = price;
    }

    public void getOrderEntity(OrderEntity order) {
        id.setOrderEntity(order);
    }

    public void setProductEntity(ProductEntity product) {
        id.setProductEntity(product);
    }

    public ProductEntity getProductEntity() {
        return id.getProductEntity();
    }

    public OrderEntity getOrderEntity() {
        return id.getOrderEntity();
    }

}