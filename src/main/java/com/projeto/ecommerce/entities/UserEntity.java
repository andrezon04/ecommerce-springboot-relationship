package com.projeto.ecommerce.entities;

import com.projeto.ecommerce.enums.RoleEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_user")
public class UserEntity {

    @Id // Chave primária
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    @Column(unique = true)
    private String email;
    private String phone;
    private String password;
    @Enumerated(EnumType.STRING) // Salvar no banco com as informações do Enum e não com zero, 1, 2...
    private RoleEnum roles; // Servirá pra gerenciar as permissões do usuário

    @OneToMany(mappedBy = "client") // Anotation pra falar que é uma relaçao 1 para muitos baseado na chave estrangeira client
    private List<OrderEntity> orders = new ArrayList<>(); // Criando uma lista pra mostrar todos os pedidos dos Usuários
}