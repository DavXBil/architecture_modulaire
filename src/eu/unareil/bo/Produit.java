package eu.unareil.bo;

public class Produit {

    private long refProd;
    private String marque;
    private String libelle;
    private long qteStock;
    private float prixUnitaire;


    public Produit () {
        super();
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produit{");
        sb.append("refProd=").append(refProd);
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", libelle='").append(libelle).append('\'');
        sb.append(", qteStock=").append(qteStock);
        sb.append(", prixUnitaire=").append(prixUnitaire);
        sb.append('}');
        return sb.toString();
    }

}
