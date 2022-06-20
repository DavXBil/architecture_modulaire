package eu.unareil.bo;

import java.time.LocalDate;

public class Pain extends ProduitPerissable{

    int poids;

    public Pain() {
        super();
    }

    public Pain(long refProd, String libelle, String marque, float prixUnitaire, long qteStock, int poids) {
        super(refProd, libelle, marque, prixUnitaire, qteStock, LocalDate.now().plusDays(2));
        this.poids = poids;
    }

    public Pain(String libelle, String marque, float prixUnitaire, long qteStock, LocalDate datLimiteConso, int poids) {
        super(libelle, marque, prixUnitaire, qteStock, LocalDate.now().plusDays(2));
        this.poids = poids;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pain{");
        sb.append("poids=").append(poids);
        sb.append(", datLimiteConso=").append(datLimiteConso);
        sb.append(", refProd=").append(refProd);
        sb.append(", libelle='").append(libelle).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", prixUnitaire=").append(prixUnitaire);
        sb.append(", qteStock=").append(qteStock);
        sb.append('}');
        return sb.toString();
    }
}
