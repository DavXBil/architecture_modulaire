package eu.unareil.bo;

import java.time.LocalDate;

public class ProduitPerissable extends Produit {

    LocalDate datLimiteConso;

    public ProduitPerissable(LocalDate datLimiteConso) {
        this.datLimiteConso = datLimiteConso;
    }

    public ProduitPerissable(long refProd, LocalDate datLimiteConso, String marque, String libelle, long qteStock, float prixUnitaire ) {
        super(refProd, marque, libelle, qteStock, prixUnitaire);
        this.datLimiteConso = datLimiteConso;
    }

    public ProduitPerissable( LocalDate datLimiteConso, String marque, String libelle, long qteStock, float prixUnitaire) {
        super(marque, libelle, qteStock, prixUnitaire);
        this.datLimiteConso = datLimiteConso;
    }

    public LocalDate getDatLimiteConso() {
        return datLimiteConso;
    }

    public void setDatLimiteConso(LocalDate datLimiteConso) {
        this.datLimiteConso = datLimiteConso;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProduitPerissable{");
        sb.append("datLimiteConso=").append(datLimiteConso);
        sb.append(", refProd=").append(refProd);
        sb.append(", libelle='").append(libelle).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", prixUnitaire=").append(prixUnitaire);
        sb.append(", qteStock=").append(qteStock);
        sb.append('}');
        return sb.toString();
    }
}
