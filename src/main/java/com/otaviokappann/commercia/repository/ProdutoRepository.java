package com.otaviokappann.commercia.repository;

import com.otaviokappann.commercia.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
