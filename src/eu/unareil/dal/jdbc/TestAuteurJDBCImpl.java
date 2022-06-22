package eu.unareil.dal.jdbc;

import eu.unareil.bo.Auteur;
import eu.unareil.dal.DALException;

import java.util.List;

public class TestAuteurJDBCImpl {

    public static void main(String[] args) throws DALException {

        AuteurJDBCImpl auteurJDBC = new AuteurJDBCImpl();

        try {
            List<Auteur> auteurs = auteurJDBC.selectAll();
            for (Auteur auteur : auteurs) {
                System.out.println(auteur.toString());
            }
        }catch (DALException e) {
            System.out.println(e.getCause());
        }

        /*try {
            Auteur auteur = new Auteur("Efface", "Moi");
            auteurJDBC.insert(auteur);
        } catch (DALException e) {
            System.out.println(e.getCause());
        }*/

        try {
            Auteur auteur = auteurJDBC.selectById(5);

            System.out.println(auteur);
        } catch (DALException e) {
            System.out.println(e.getCause());
        }

       /* try {
            Auteur auteur = new Auteur(5, "Efface", "Mi");
            auteurJDBC.update(auteur);
        } catch (DALException e) {
            System.out.println(e.getCause());
        }*/

        /*try {
            Auteur auteur = auteurJDBC.selectById(5);

            System.out.println(auteur);
        } catch (DALException e) {
            System.out.println(e.getCause());
        }*/

       /*try {
            Auteur auteur = new Auteur(5, "Efface", "Mi");
            auteurJDBC.delete(auteur);
       } catch (DALException e) {
           System.out.println(e.getCause());
       }*/
    }
}
