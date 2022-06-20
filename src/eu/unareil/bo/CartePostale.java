package eu.unareil.bo;

import java.util.ArrayList;
import java.util.List;

public class CartePostale extends Produit {

    private TypeCartePostale typeCartePostale;
    private List<Auteur> auteurs = new ArrayList<Auteur>();

    public CartePostale(TypeCartePostale typeCartePostale, List<Auteur> auteurs) {
        this.typeCartePostale = typeCartePostale;
        this.auteurs = auteurs;
    }


    public CartePostale(long refProd, String marque, String libelle, long qteStock, float prixUnitaire, List<Auteur> auteurs, TypeCartePostale typeCartePostale) {
        super(refProd, libelle, marque, qteStock, prixUnitaire);
        this.typeCartePostale = typeCartePostale;
        this.auteurs = auteurs;
    }

    public CartePostale(String marque, String libelle, long qteStock, float prixUnitaire, List<Auteur> auteurs, TypeCartePostale typeCartePostale ) {
        super(marque, libelle, qteStock, prixUnitaire);
        this.typeCartePostale = typeCartePostale;
        this.auteurs = auteurs;
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
        sb.append(", libelle='").append(this.getLibelle()).append('\'');
        sb.append(", marque='").append(this.getMarque()).append('\'');
        sb.append(", prixUnitaire=").append(this.getPrixUnitaire()).append("€");
        sb.append(", qteStock=").append(this.getQteStock());
        sb.append(", auteur=");
        for (Auteur auteur : auteurs) {
            sb.append(auteur.getNom()).append(" ").append(auteur.getPrenom()).append(", ");
        }
        sb.append("typeCartePostale=").append(typeCartePostale);
        sb.append('}');
        return sb.toString();
    }
}
