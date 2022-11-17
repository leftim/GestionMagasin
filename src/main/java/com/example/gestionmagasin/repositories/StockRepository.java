package com.example.gestionmagasin.repositories;

import com.example.gestionmagasin.entities.Client;
import com.example.gestionmagasin.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockRepository extends JpaRepository<Stock,Long> {

}
