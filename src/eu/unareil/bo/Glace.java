package eu.unareil.bo;

import java.time.LocalDate;

public class Glace extends ProduitPerissable{

    String parfum;
    int temperatureConservation;


    public Glace() {
        super();
    }

    public Glace(long refProd, String libelle, String marque, float prixUnitaire, long qteStock, LocalDate datLimiteConso, String parfum, int temperatureConservation) {
        super(refProd, libelle, marque, prixUnitaire, qteStock, datLimiteConso);
        this.parfum = parfum;
        this.temperatureConservation = temperatureConservation;
    }

    public Glace(String libelle, String marque, float prixUnitaire, long qteStock, LocalDate datLimiteConso, String parfum, int temperatureConservation) {
        super(libelle, marque, prixUnitaire, qteStock, datLimiteConso);
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
        sb.append("parfum='").append(parfum).append('\'');
        sb.append(", temperatureConservation=").append(temperatureConservation);
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
