package com.example.gestionmagasin.controllers;

import com.example.gestionmagasin.entities.Client;
import com.example.gestionmagasin.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/client")
@RestController
public class ClientRestController {

    @Autowired
    ClientService clientService;

    @GetMapping("/retrieveAllClients")
    public List<Client> retrieveAllClients(){
        return clientService.retrieveAllClients();
    }

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client c)
    {
        return clientService.addClient(c);
    }

    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable(value ="id") Long id){
         clientService.deleteClient(id);
    }

    @PutMapping("/updateClient")
    public Client updateClient(@RequestBody Client c){
    return clientService.updateClient(c);

    }

    @GetMapping("/retrieveClient/{id}")
    public Client retrieveClient(@PathVariable(value="id") Long id){
        return clientService.retrieveClient(id);
}




}
