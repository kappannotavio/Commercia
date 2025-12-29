package com.otaviokappann.commercia.repository;

import com.otaviokappann.commercia.entity.PedidoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoItem,Long> {
}
