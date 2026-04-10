package com.projeto.ecommerce.entities;

import com.projeto.ecommerce.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_order")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private LocalDate moment;
    private OrderStatus status;

    @ManyToOne //  Annotation pra falar que é uma relação de muitos-para-um
    @JoinColumn(name = "cliente_id") //  Define qual coluna será usada como chave estrangeira na tabela
    private UserEntity client;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private PaymentEntity payment;

    @OneToMany(mappedBy = "id.orderEntity") // Set é uma lista de elementos com valores que NÃO se repetem
    private Set<OrderItem> items = new HashSet<>();

}