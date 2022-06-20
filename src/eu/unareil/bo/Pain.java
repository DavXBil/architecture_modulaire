package eu.unareil.bo;

import java.time.LocalDate;

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
        final StringBuilder sb = new StringBuilder("Pain{");
        sb.append(", libelle='").append(this.getLibelle()).append('\'');
        sb.append(", marque='").append(this.getMarque()).append('\'');
        sb.append(", prixUnitaire=").append(this.getPrixUnitaire());
        sb.append(", qteStock=").append(this.getQteStock());
        sb.append(", datLimiteConso=").append(this.getDatLimiteConso());
        sb.append("poids=").append(this.getPoids());
        sb.append('}');
        return sb.toString();
    }
}
