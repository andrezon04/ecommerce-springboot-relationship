package com.projeto.ecommerce.entities;

import com.projeto.ecommerce.enums.StatusDoPedido;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.UUID;

@Getter
@Setter
@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private LocalDate moment;
    private StatusDoPedido status;
    //  Annotation pra falar que é uma relação de muitos-para-um
    @ManyToOne
    //  Define qual coluna será usada como chave estrangeira na tabela
    @JoinColumn(name = "cliente_id")
    private UserEntity client;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private PaymentEntity payment;

    @OneToMany(mappedBy = "id.orderEntity") // Set é uma lista de elementos com valores que NÃO se repetem
    private Set<OrderItem> items = new HashSet<>();

    public Set<OrderItem> getItems() {
        return items.stream().map(x -> x.getProduct()).tolist();
    }

    public void setItems(Set<OrderItem> items) {
        this.items = items;
    }
}