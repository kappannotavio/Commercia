package com.otaviokappann.commercia.entity;

import com.otaviokappann.commercia.enums.Status;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User usuario;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PedidoItem> itens = new ArrayList<>();

    private LocalDateTime dataCriacao;

    @Enumerated(EnumType.STRING)
    private Status status;

    private BigDecimal valorTotal;

}
