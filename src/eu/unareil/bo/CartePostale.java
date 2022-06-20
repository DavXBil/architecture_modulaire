package eu.unareil.bo;

public class CartePostale extends Produit {

    TypeCartePostale typeCartePostale;
    Auteur auteur;

    public CartePostale() {
        super();
    }


    public CartePostale(long refProd, String marque ,String libelle, float prixUnitaire, long qteStock, Auteur auteur, TypeCartePostale typeCartePostale) {
        super(refProd, libelle, marque, prixUnitaire, qteStock);
        this.typeCartePostale = typeCartePostale;
        this.auteur = auteur;
    }

    public CartePostale(String libelle, String marque, float prixUnitaire, long qteStock, TypeCartePostale typeCartePostale, Auteur auteur) {
        super(libelle, marque, prixUnitaire, qteStock);
        this.typeCartePostale = typeCartePostale;
        this.auteur = auteur;
    }

    public TypeCartePostale getTypeCartePostale() {
        return typeCartePostale;
    }

    public void setTypeCartePostale(TypeCartePostale typeCartePostale) {
        this.typeCartePostale = typeCartePostale;
    }
}
