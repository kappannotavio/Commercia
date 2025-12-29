package com.otaviokappann.commercia.repository;

import com.otaviokappann.commercia.entity.CarrinhoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends JpaRepository<CarrinhoItem,Long> {
}
