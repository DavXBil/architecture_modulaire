package eu.unareil.bo;

public class Stylo extends Produit{

    String couleur;
    String typeMine;


    public Stylo() {
        super();
    }

    public Stylo(long refProd, String libelle, String marque, float prixUnitaire, long qteStock, String couleur, String typeMine) {
        super(refProd, libelle, marque, prixUnitaire, qteStock);
        this.couleur = couleur;
        this.typeMine = typeMine;
    }

    public Stylo(String libelle, String marque, float prixUnitaire, long qteStock, String couleur, String typeMine) {
        super(libelle, marque, prixUnitaire, qteStock);
        this.couleur = couleur;
        this.typeMine = typeMine;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getTypeMine() {
        return typeMine;
    }

    public void setTypeMine(String typeMine) {
        this.typeMine = typeMine;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stylo{");
        sb.append("couleur='").append(couleur).append('\'');
        sb.append(", typeMine='").append(typeMine).append('\'');
        sb.append(", refProd=").append(refProd);
        sb.append(", libelle='").append(libelle).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", prixUnitaire=").append(prixUnitaire);
        sb.append(", qteStock=").append(qteStock);
        sb.append('}');
        return sb.toString();
    }
}
