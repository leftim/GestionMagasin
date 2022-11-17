package com.example.gestionmagasin.repositories;

import com.example.gestionmagasin.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
