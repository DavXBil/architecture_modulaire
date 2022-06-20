package eu.unareil.bo;

public class Ligne {

    private int index;
    private int quantite;
    private Produit produit;


    public Ligne() {

    }

    public Ligne(Produit produit, int quantite) {
        this.setQuantite(quantite);
        this.setProduit(produit);
    }

    public Ligne( int index, int quantite, Produit produit) {
        this.setQuantite(quantite);
        this.setProduit(produit);
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public double getPrix() {
        return this.getQuantite() * this.getProduit().getPrixUnitaire();
    }


    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public void setId(int id) {
        this.index = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ligne{");
        sb.append("produit=").append(this.getProduit());
        sb.append(", quantite=").append(this.getQuantite());
        sb.append(", prix=").append(this.getPrix());
        sb.append('}');
        return sb.toString();
    }
}
