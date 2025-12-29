package com.otaviokappann.commercia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PedidoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    private int quantidade;
    private BigDecimal subtotal;

}
