package com.example.gestionmagasin.repositories;

import com.example.gestionmagasin.entities.Produit;
import com.example.gestionmagasin.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
