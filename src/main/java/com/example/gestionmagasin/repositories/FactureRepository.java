package com.example.gestionmagasin.repositories;

import com.example.gestionmagasin.entities.Facture;
import com.example.gestionmagasin.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository  extends JpaRepository<Facture,Long> {
}
