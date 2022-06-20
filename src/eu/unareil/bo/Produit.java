package eu.unareil.bo;

public class Produit {

    long refProd;
    String libelle;
    String marque;
    float prixUnitaire;
    long qteStock;


    public Produit () {
        super();
    }
    public Produit(long refProd, String libelle, String marque, float prixUnitaire, long qteStock) {
        this.refProd = refProd;
        this.libelle = libelle;
        this.marque = marque;
        this.prixUnitaire = prixUnitaire;
        this.qteStock = qteStock;
    }

    public Produit(String libelle, String marque, float prixUnitaire, long qteStock) {
        this.libelle = libelle;
        this.marque = marque;
        this.prixUnitaire = prixUnitaire;
        this.qteStock = qteStock;
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

    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public long getQteStock() {
        return qteStock;
    }

    public void setQteStock(long qteStock) {
        this.qteStock = qteStock;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produit{");
        sb.append("refProd=").append(refProd);
        sb.append(", libelle='").append(libelle).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", prixUnitaire=").append(prixUnitaire);
        sb.append(", qteStock=").append(qteStock);
        sb.append('}');
        return sb.toString();
    }
}
