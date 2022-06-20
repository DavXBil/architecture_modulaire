package eu.unareil.bo;

public class Auteur {

    String prenom;
    String nom;



    public Auteur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Auteur{");
        sb.append("prenom='").append(prenom).append('\'');
        sb.append(", nom='").append(nom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
