package eu.unareil.bo;

import java.util.ArrayList;
import java.util.List;

public class CartePostale extends Produit {

    private TypeCartePostale typeCartePostale;
    private List<Auteur> auteur = new ArrayList<Auteur>();

    public CartePostale(TypeCartePostale typeCartePostale, List<Auteur> auteur) {
        this.typeCartePostale = typeCartePostale;
        this.auteur = auteur;
    }


    public CartePostale(long refProd, String marque, String libelle, long qteStock, float prixUnitaire, List<Auteur> auteur, TypeCartePostale typeCartePostale) {
        super(refProd, libelle, marque, qteStock, prixUnitaire);
        this.typeCartePostale = typeCartePostale;
        this.auteur = auteur;
    }

    public CartePostale(String marque, String libelle, long qteStock, float prixUnitaire, List<Auteur> auteur, TypeCartePostale typeCartePostale ) {
        super(marque, libelle, qteStock, prixUnitaire);
        this.typeCartePostale = typeCartePostale;
        this.auteur = auteur;
    }

    public TypeCartePostale getTypeCartePostale() {
        return typeCartePostale;
    }

    public void setTypeCartePostale(TypeCartePostale typeCartePostale) {
        this.typeCartePostale = typeCartePostale;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CartePostale{");
        sb.append(", libelle='").append(libelle).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", prixUnitaire=").append(prixUnitaire);
        sb.append(", qteStock=").append(qteStock);
        sb.append(", auteur=").append(auteur);
        sb.append("typeCartePostale=").append(typeCartePostale);
        sb.append('}');
        return sb.toString();
    }
}
