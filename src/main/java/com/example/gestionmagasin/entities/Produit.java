package com.example.gestionmagasin.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.soap.Detail;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;
    @ManyToMany
    private List<Fournisseur> fournisseur;
    @ManyToOne
    private Rayon rayon;
    @ManyToOne
    private Stock stock;
    @OneToOne(cascade = CascadeType.PERSIST)
    private DetailProduit detailProduit;
    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFacture ;





}
