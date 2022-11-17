package com.example.gestionmagasin.services;

import com.example.gestionmagasin.entities.Facture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FactureService {
    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);
}
