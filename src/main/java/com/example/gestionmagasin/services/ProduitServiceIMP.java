package com.example.gestionmagasin.services;

import com.example.gestionmagasin.entities.Produit;
import com.example.gestionmagasin.entities.Rayon;
import com.example.gestionmagasin.entities.Stock;
import com.example.gestionmagasin.repositories.ProduitRepository;
import com.example.gestionmagasin.repositories.RayonRepository;
import com.example.gestionmagasin.repositories.StockRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceIMP implements ProduitService{

    ProduitRepository produitRepository;
    RayonRepository rayonRepository;
    StockRepository stockRepository;
    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        Rayon r = rayonRepository.findById(idRayon).orElse(null);
        Stock s = stockRepository.findById(idStock).orElse(null);
        p.setRayon(r);
        p.setStock(s);

       return produitRepository.save(p);

    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    public void assignProduitToStock(Long idProduit, Long idStock){

        Produit produit = produitRepository.findById(idProduit).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);

        if (produit != null && stock != null) {
            produit.setStock(stock);
            produitRepository.save(produit);
        }

    }
}
