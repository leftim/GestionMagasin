package com.example.gestionmagasin.services;

import com.example.gestionmagasin.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService  {
    List<Client> retrieveAllClients();
    Client addClient(Client c);
     void deleteClient(Long id);
     Client updateClient(Client c);
    Client retrieveClient(Long id);
}
