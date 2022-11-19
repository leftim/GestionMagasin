package com.example.gestionmagasin.services;

import com.example.gestionmagasin.entities.Client;
import com.example.gestionmagasin.entities.Facture;
import com.example.gestionmagasin.repositories.ClientRepository;
import com.example.gestionmagasin.repositories.FactureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureServiceIMP implements FactureService{

    FactureRepository factureRepository;
    ClientRepository clientRepository;

    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        Facture facture= factureRepository.findById(id).orElse(null);
        facture.setActive(false);


    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

    public List<Facture> getFacturesByClient(Long idClient){
        Client client= clientRepository.findById(idClient).orElse(null);
        if(client != null){
            return client.getFacture();
        }

        return null;
    }
    @Override
    public Facture addFacture(Facture f, Long idClient) {
        Client client = clientRepository.findById(idClient).orElse(null);
        if(client != null)
            f.setClient(client);
        return null;
    }
}
