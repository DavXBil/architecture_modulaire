package eu.unareil.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProduitPerissable extends Produit {

    LocalDate datLimiteConso;

    public ProduitPerissable(LocalDate datLimiteConso) {
        this.setDatLimiteConso(datLimiteConso);
    }

    public ProduitPerissable(long refProd, LocalDate datLimiteConso, String marque, String libelle, long qteStock, float prixUnitaire ) {
        super(refProd, marque, libelle, qteStock, prixUnitaire);
        this.setDatLimiteConso(datLimiteConso);
    }

    public ProduitPerissable( LocalDate datLimiteConso, String marque, String libelle, long qteStock, float prixUnitaire) {
        super(marque, libelle, qteStock, prixUnitaire);
        this.setDatLimiteConso(datLimiteConso);
    }

    public LocalDate getDatLimiteConso() {

        return datLimiteConso;
    }

    public void setDatLimiteConso(LocalDate datLimiteConso) {
        this.datLimiteConso = datLimiteConso;
    }

    @Override
    public String toString() {
        DateTimeFormatter formDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        final StringBuilder sb = new StringBuilder("ProduitPerissable{");
        sb.append("datLimiteConso=").append(this.getDatLimiteConso().format(formDate));
        sb.append(", libelle='").append(this.getLibelle()).append('\'');
        sb.append(", marque='").append(this.getMarque()).append('\'');
        sb.append(", prixUnitaire=").append(this.getPrixUnitaire()).append("€");
        sb.append(", qteStock=").append(this.getQteStock());
        sb.append('}');
        return sb.toString();
    }
}
