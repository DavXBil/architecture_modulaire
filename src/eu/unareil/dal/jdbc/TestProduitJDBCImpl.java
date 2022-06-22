package eu.unareil.dal.jdbc;

import eu.unareil.bo.Glace;
import eu.unareil.bo.Pain;
import eu.unareil.bo.Produit;
import eu.unareil.bo.Stylo;
import eu.unareil.dal.DALException;

import java.time.LocalDate;
import java.util.List;

public class TestProduitJDBCImpl {

    public static void main(String[] args) {

        ProduitJDBCimpl prodJDBC = new ProduitJDBCimpl();


        /*try {
            Stylo stylo = new Stylo("test", "test", 1000, 12.5f, "bleu", "2B");

            Pain pain = new Pain("test", "test", 25f, 12000, 1.5f);

            Glace glace = new Glace(LocalDate.now().plusDays(2),"test", "test", -18, "Vanille", 12500, 5.50f);

            prodJDBC.insert(glace);

        } catch (DALException e) {
            System.out.println(e.getCause());
        }*/

        /*try {
            Glace glace = new Glace(13, LocalDate.now().plusDays(2),"test", "test", 12500, 3.50f,"Vanille" , -18);

            prodJDBC.delete(glace);

        } catch (DALException e) {

            System.out.println(e.getCause());

        }*/

        /*try {

            Produit produit = prodJDBC.selectById(7);
            Produit produit2 = prodJDBC.selectById(11);
            Produit produit3 = prodJDBC.selectById(4);
            System.out.println(produit.toString());
            System.out.println(produit2.toString());
            System.out.println(produit3.toString());

        } catch (DALException e) {

            System.out.println(e.getCause());

        }*/

        try {

            List<Produit> produits = prodJDBC.selectAll();
            System.out.println(produits);

        } catch (DALException e) {

            System.out.println(e.getCause());

        }
    }

}
