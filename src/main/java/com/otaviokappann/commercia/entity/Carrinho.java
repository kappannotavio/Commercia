package com.otaviokappann.commercia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User usuario;

    @OneToMany(mappedBy = "carrinho", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CarrinhoItem> itens = new ArrayList<>();


}