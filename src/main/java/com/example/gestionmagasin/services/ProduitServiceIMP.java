package com.example.gestionmagasin.services;

import com.example.gestionmagasin.entities.*;
import com.example.gestionmagasin.repositories.*;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProduitServiceIMP implements ProduitService{

    ProduitRepository produitRepository;
    RayonRepository rayonRepository;
    StockRepository stockRepository;
    FournisseurRepository fournisseurRepository;

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        Stock s = stockRepository.findById(idStock).orElse(null);
        Rayon r = rayonRepository.findById(idRayon).orElse(null);

        p.setRayon(r);
        p.setStock(s);

       return produitRepository.save(p);

    }


    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }
    @Override
    public void assignProduitToStock(Long idProduit, Long idStock){

        Produit produit = produitRepository.findById(idProduit).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);

        if (produit != null && stock != null) {
            produit.setStock(stock);
            produitRepository.save(produit);
        }

    }

    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Produit produit = produitRepository.findById(produitId).orElse(null);
        Fournisseur fournisseur = fournisseurRepository.findById(fournisseurId).orElse(null);
        if (produit != null && fournisseur != null) {
            produit.getFournisseur().add(fournisseur);
            produitRepository.save(produit);
        }
    }

    @Override
    public float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate) {
        return 0;
    }


}
