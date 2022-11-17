package com.example.gestionmagasin.controllers;

import com.example.gestionmagasin.entities.Produit;
import com.example.gestionmagasin.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/produit")
@RestController
public class ProduitRestController {

    @Autowired
    ProduitService produitService;

    @GetMapping("/retrieveAllProduit")
    public List<Produit> retrieveAllProduit(){
        return produitService.retrieveAllProduits();
    }

    @GetMapping("/retrieveProduit/{id}")
    public Produit retrieveProduit(@PathVariable(value="id") Long id){
        return produitService.retrieveProduit(id);
    }

    @PostMapping("/addProduit/{idRayon}/{idStock}")
    public Produit addProduit(@RequestBody Produit p, @PathVariable(value="idRayon") Long idRayon,@PathVariable(value="idStock") Long idStock)
    {
        return produitService.addProduit(p,idRayon,idStock);
    }

    @PutMapping("/assignPtoS/{IdProduit}/{IdStock}")
    void assignProduitToStock(Long idProduit, Long idStock){
         produitService.assignProduitToStock(idProduit,idStock);
    }



}
