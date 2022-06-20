package eu.unareil.bo;

import java.time.LocalDate;

public class Glace extends ProduitPerissable{

    private String parfum;
    private int temperatureConservation;


    public Glace( LocalDate datLimiteConso ,String parfum, int temperatureConservation) {
        super(datLimiteConso);
        this.setParfum(parfum);
        this.setTemperatureConservation(temperatureConservation);
    }

    public Glace(LocalDate datLimiteConso, String marque, String libelle, int temperatureConservation, String parfum, long qteStock, float prixUnitaire) {
        super(datLimiteConso, marque, libelle, qteStock, prixUnitaire);
        this.setParfum(parfum);
        this.setTemperatureConservation(temperatureConservation);
    }

    public Glace(long refProd, LocalDate datLimiteConso, String marque, String libelle, long qteStock, float prixUnitaire,  String parfum, int temperatureConservation) {
        super(refProd, datLimiteConso, marque, libelle, qteStock, prixUnitaire);
        this.setParfum(parfum);
        this.setTemperatureConservation(temperatureConservation);
    }


    public String getParfum() {
        return parfum;
    }

    public void setParfum(String parfum) {
        this.parfum = parfum;
    }

    public int getTemperatureConservation() {
        return temperatureConservation;
    }

    public void setTemperatureConservation(int temperatureConservation) {
        this.temperatureConservation = temperatureConservation;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Glace{");
        sb.append(", libelle='").append(this.getLibelle()).append('\'');
        sb.append(", marque='").append(this.getMarque()).append('\'');
        sb.append(", prixUnitaire=").append(this.getPrixUnitaire());
        sb.append(", qteStock=").append(this.getQteStock());
        sb.append(", datLimiteConso=").append(this.getDatLimiteConso());
        sb.append("parfum='").append(this.getParfum()).append('\'');
        sb.append(", temperatureConservation=").append(this.getTemperatureConservation());
        sb.append('}');
        return sb.toString();
    }
}
