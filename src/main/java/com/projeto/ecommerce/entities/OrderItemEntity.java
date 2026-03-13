package com.projeto.ecommerce.entities;

import jakarta.persistence.EmbeddedId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemEntity {

    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    private int quantity;
    private double price;

    public OrderItemEntity(OrderEntity order, ProductEntity product, int quantity, double price) {
        id.setOrderEntity(order);
        id.setProductEntity(product);
        this.quantity = quantity;
        this.price = price;
    }

    public ProductEntity getProduct() {
        return id.getProductEntity();
    }

    public OrderEntity getOrder() {
        return id.getOrderEntity();
    }

    public void getOrderEntity(OrderEntity orderEntity) {
        id.setOrderEntity(orderEntity);
    }

    public void setProductEntity(ProductEntity productEntity) {
        id.setProductEntity(productEntity);
    }

}