package eu.unareil.bo;

import java.time.LocalDate;

public class Pain extends ProduitPerissable{

    float poids;

    public Pain(LocalDate datLimiteConso, float poids) {
        super(datLimiteConso);
        this.poids = poids;
    }

    public Pain(long refProd, String marque, String libelle, float poids , long qteStock, float prixUnitaire) {
        super(refProd, LocalDate.now().plusDays(2), marque, libelle, qteStock, prixUnitaire);
        this.poids = poids;
    }

    public Pain( String marque, String libelle, float poids, long qteStock, float prixUnitaire) {
        super( LocalDate.now().plusDays(2), marque, libelle, qteStock, prixUnitaire);
        this.poids = poids;
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
        sb.append(", libelle='").append(libelle).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", prixUnitaire=").append(prixUnitaire);
        sb.append(", qteStock=").append(qteStock);
        sb.append(", datLimiteConso=").append(datLimiteConso);
        sb.append(", refProd=").append(refProd);
        sb.append("poids=").append(poids);
        sb.append('}');
        return sb.toString();
    }
}
