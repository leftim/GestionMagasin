package com.example.gestionmagasin.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long idDetailFacture;
    private Integer qte;
    private float prixTotal;
    private Integer pourcentageRemise;
    private Integer montantRemise;

    @ManyToOne
    private Produit produit;
    @ManyToOne
    private Facture facture;





}
