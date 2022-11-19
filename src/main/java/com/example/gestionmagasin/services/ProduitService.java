package com.example.gestionmagasin.services;

import com.example.gestionmagasin.entities.Produit;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface ProduitService {
    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);

    void assignProduitToStock(Long idProduit, Long idStock);
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
    float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate);
}
