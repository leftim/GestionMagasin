package com.example.gestionmagasin.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailProduit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idDetailProduit;
    @Temporal(TemporalType.DATE)
    private Date datecreation;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    @Enumerated(EnumType.STRING)
    private CategorieProduit categorieProduit;
    @OneToOne(mappedBy = "detailProduit")
    private Produit produit;
}
