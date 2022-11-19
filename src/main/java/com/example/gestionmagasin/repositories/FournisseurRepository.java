package com.example.gestionmagasin.repositories;

import com.example.gestionmagasin.entities.Client;
import com.example.gestionmagasin.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {


}
