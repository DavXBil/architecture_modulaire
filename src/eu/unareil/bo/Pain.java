package eu.unareil.bo;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pain extends ProduitPerissable{

    private float poids;

    public Pain(LocalDate datLimiteConso, float poids) {
        super(datLimiteConso);
        this.setPoids(poids);
    }

    public Pain(long refProd, String marque, String libelle, float poids , long qteStock, float prixUnitaire) {
        super(refProd, LocalDate.now().plusDays(2), marque, libelle, qteStock, prixUnitaire);
        this.setPoids(poids);
    }

    public Pain( String marque, String libelle, float poids, long qteStock, float prixUnitaire) {
        super( LocalDate.now().plusDays(2), marque, libelle, qteStock, prixUnitaire);
        this.setPoids(poids);
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {

        DateTimeFormatter formDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        final StringBuilder sb = new StringBuilder("Pain{");
        sb.append(", libelle='").append(this.getLibelle()).append('\'');
        sb.append(", marque='").append(this.getMarque()).append('\'');
        sb.append(", prixUnitaire=").append(decimalFormat.format(this.getPrixUnitaire())).append("€");
        sb.append(", qteStock=").append(this.getQteStock());
        sb.append("datLimiteConso=").append(this.getDatLimiteConso().format(formDate));
        sb.append(", poids=").append(this.getPoids());
        sb.append('}');
        return sb.toString();
    }
}
