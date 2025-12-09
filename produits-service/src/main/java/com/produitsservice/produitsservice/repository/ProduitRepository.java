package com.produitsservice.produitsservice.repository;

import com.produitsservice.produitsservice.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}