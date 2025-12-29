package com.otaviokappann.commercia.entity;

import com.otaviokappann.commercia.enums.Role;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pedido> listaDePedidos = new ArrayList<>();

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private Carrinho carrinho;



}
