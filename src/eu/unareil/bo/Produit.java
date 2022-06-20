package eu.unareil.bo;

public class Produit {

    long refProd;
    String marque;
    String libelle;
    long qteStock;
    float prixUnitaire;


    public Produit () {
    }

    public Produit(long refProd, String marque, String libelle, long qteStock, float prixUnitaire) {
        this.refProd = refProd;
        this.marque = marque;
        this.libelle = libelle;
        this.qteStock = qteStock;
        this.prixUnitaire = prixUnitaire;
    }

    public Produit(String marque, String libelle, long qteStock, float prixUnitaire) {
        this.marque = marque;
        this.libelle = libelle;
        this.qteStock = qteStock;
        this.prixUnitaire = prixUnitaire;
    }

    public long getRefProd() {
        return refProd;
    }

    public void setRefProd(long refProd) {
        this.refProd = refProd;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(int prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public long getQteStock() {
        return qteStock;
    }

    public void setQteStock(long qteStock) {
        this.qteStock = qteStock;
    }
}
