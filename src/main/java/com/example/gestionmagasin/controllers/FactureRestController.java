package com.example.gestionmagasin.controllers;


import com.example.gestionmagasin.entities.Facture;
import com.example.gestionmagasin.services.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureRestController {
    @Autowired
    FactureService factureService;

    @GetMapping()
    public List<Facture> retrieveAllFactures() {
        return factureService.retrieveAllFactures();
    }

    @DeleteMapping("/{id}")
    public void cancelFacture(@PathVariable(value = "id") long id) {
        factureService.cancelFacture(id);
    }

    @GetMapping("/{id}")
    public Facture retrieveFacture(@PathVariable(value = "id") long id) {
        return factureService.retrieveFacture(id);
    }

    @GetMapping("/{idClient}")
    public List<Facture> getFacturesByClient(@PathVariable(value = "idClient") long idClient) {
        return factureService.getFacturesByClient(idClient);
    }

    @PostMapping("/{idClient}")
    public Facture addFacture(@RequestBody Facture f, @PathVariable(value = "idClient") Long idClient) {
        return factureService.addFacture(f, idClient);
    }
}

