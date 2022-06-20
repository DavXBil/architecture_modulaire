package eu.unareil.bo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Achat {

    private double montant;
    List<Ligne> lignes = new ArrayList<Ligne>();

    public Achat(Ligne ligne) {
        this.lignes.add(ligne);
    }

    public Achat(double montant, List<Ligne> lignes) {
        this.montant = montant;
        this.lignes = lignes;
    }

    public List<Ligne> getLignes() {
        return lignes;
    }

    public Ligne getLigne(int index) {
        return lignes.get(index);
    }

    public void ajouteLigne(Produit produit, int qte) {
        lignes.add(new Ligne(produit, qte));
    }

    public void modifieLigne(int index, int nouvQuantite) {
        lignes.get(index).setQuantite(nouvQuantite);
    }

    public void supprimeLigne(int index) {
        lignes.remove(index);
    }


    public double getMontant() {
        return montant;
    }

    public double calculMontant() {
        montant = 0;
        for (Ligne ligne : lignes) {
            montant += ligne.getQuantite() * ligne.getProduit().getPrixUnitaire();
        }
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {

        DecimalFormat format = new DecimalFormat("0.00");

        final StringBuilder sb = new StringBuilder("Achat{");
        sb.append(", lignes=").append(this.getLignes()).append('\n');


        sb.append("Total de l'achat : ").append(format.format(calculMontant())).append("€");
        sb.append('}');
        return sb.toString();
    }
}
