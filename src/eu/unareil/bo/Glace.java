package eu.unareil.bo;

import java.time.LocalDate;

public class Glace extends ProduitPerissable{

    String parfum;
    int temperatureConservation;


    public Glace( LocalDate datLimiteConso ,String parfum, int temperatureConservation) {
        super(datLimiteConso);
        this.parfum = parfum;
        this.temperatureConservation = temperatureConservation;
    }

    public Glace(LocalDate datLimiteConso, String marque, String libelle, int temperatureConservation, String parfum, long qteStock, float prixUnitaire) {
        super(datLimiteConso, marque, libelle, qteStock, prixUnitaire);
        this.parfum = parfum;
        this.temperatureConservation = temperatureConservation;
    }

    public Glace(long refProd, LocalDate datLimiteConso, String marque, String libelle, long qteStock, float prixUnitaire,  String parfum, int temperatureConservation) {
        super(refProd, datLimiteConso, marque, libelle, qteStock, prixUnitaire);
        this.parfum = parfum;
        this.temperatureConservation = temperatureConservation;
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
        sb.append(", libelle='").append(libelle).append('\'');
        sb.append(", marque='").append(marque).append('\'');
        sb.append(", prixUnitaire=").append(prixUnitaire);
        sb.append(", qteStock=").append(qteStock);
        sb.append(", datLimiteConso=").append(datLimiteConso);
        sb.append("parfum='").append(parfum).append('\'');
        sb.append(", temperatureConservation=").append(temperatureConservation);
        sb.append('}');
        return sb.toString();
    }
}
