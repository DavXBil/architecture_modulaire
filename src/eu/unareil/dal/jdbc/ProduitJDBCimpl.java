package eu.unareil.dal.jdbc;

import eu.unareil.bo.*;
import eu.unareil.dal.DALException;
import eu.unareil.dal.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProduitJDBCimpl implements DAO<Produit> {

    private static final String SQL_INSERT="insert into produit (libelle, marque, prixUnitaire, qteStock, type, dateLimiteConso, poids, parfum, temperatureConservation, couleur, typeMine, typeCartePostale) values(?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE="update produit set libelle=?, marque=?, prixUnitaire=?, qteStock=?, type=?, dateLimiteConso=?, poids=?, parfum=?, temperatureConservation=?, couleur=?, typeMine=?, typeCartePostale=? where id=?";
    private static final String SQL_DELETE="delete from produit where id=?";
    private static final String SQL_SELECT_ALL="select * from produit";
    private static final String SQL_SELECT_BY_ID="select * from produit where id=?";


    @Override
    public void insert(Produit data) throws DALException {

        try (Connection connection = JDBCTools.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT)) {
                preparedStatement.setString(1, data.getLibelle());
                preparedStatement.setString(2, data.getMarque());
                preparedStatement.setFloat(3, data.getPrixUnitaire());
                preparedStatement.setFloat(4, data.getQteStock());

                if (data instanceof Stylo) {

                    preparedStatement.setString(5, "Stylo");
                    preparedStatement.setDate(6, null);
                    preparedStatement.setNull(7, Types.FLOAT);
                    preparedStatement.setString(8, null);
                    preparedStatement.setNull(9, Types.INTEGER);
                    preparedStatement.setString(10, ((Stylo) data).getCouleur());
                    preparedStatement.setString(11, ((Stylo) data).getTypeMine());
                    preparedStatement.setString(12, null);

                } else if (data instanceof Pain) {

                    preparedStatement.setString(5, "Pain");
                    preparedStatement.setDate(6, Date.valueOf(((Pain) data).getDatLimiteConso()));
                    preparedStatement.setFloat(7, ((Pain) data).getPoids());
                    preparedStatement.setString(8, null);
                    preparedStatement.setNull(9, Types.INTEGER);
                    preparedStatement.setString(10, null);
                    preparedStatement.setString(11, null);
                    preparedStatement.setString(12, null);

                } else if (data instanceof Glace) {

                    preparedStatement.setString(5, "Glace");
                    preparedStatement.setDate(6, null);
                    preparedStatement.setNull(7, Types.FLOAT);
                    preparedStatement.setString(8, ((Glace) data).getParfum());
                    preparedStatement.setInt(9, ((Glace) data).getTemperatureConservation());
                    preparedStatement.setString(10, null);
                    preparedStatement.setString(11, null);
                    preparedStatement.setString(12, null);

                }

            preparedStatement.executeUpdate();

        } catch (SQLException e) {

            throw new DALException("Erreur lors de l'insertion d'un élément chimique", e);

        }
    }

    @Override
    public void delete (Produit data) throws DALException {
        PreparedStatement pstmt = null;
        Connection cnx=null;
        long id = data.getRefProd();
        cnx = JDBCTools.getConnection();
        try {
            pstmt = cnx.prepareStatement(SQL_DELETE);
            pstmt.setLong(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new DALException("erreur du delete -id= " + id, e.getCause());
        }
        finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (cnx != null) {
                    cnx.close();
                }
            } catch (SQLException e) {
                //throw new DALException("erreur au niveau du close " + id, e.getCause());
            }
        }
    }

    @Override
    public void update(Produit data) throws DALException {
        PreparedStatement pstmt = null;
        Connection cnx=null;
        long id=data.getRefProd();
        cnx = JDBCTools.getConnection();
        try {
            pstmt = cnx.prepareStatement(SQL_UPDATE);
            pstmt.setLong(5, id);
            pstmt.setString(1, data.getLibelle());
            pstmt.setString(2, data.getMarque());
            pstmt.setFloat(3, data.getPrixUnitaire());
            pstmt.setLong(3, data.getQteStock());
           // pstmt.setFloat(4, data.getMasseAtomique());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new DALException("erreur du update -id= " + id, e.getCause());
        }
        finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (cnx != null) {
                    cnx.close();
                }
            } catch (SQLException e) {
                throw new DALException("erreur au niveau du close " + id, e.getCause());
            }
        }

    }

    @Override
    public Produit selectById(long id) throws DALException {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Produit el = null;
        //Connection cnx=null;
        Connection cnx = JDBCTools.getConnection();
        try {
            pstmt = cnx.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setLong(5, id);
            pstmt.executeQuery();
            if (rs.next()) {
                el = new Produit(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5));
            }
        } catch (SQLException e) {
            throw new DALException("erreur du select by id -id= " + id, e.getCause());
        }
        finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (cnx != null) {
                    cnx.close();
                }
            } catch (SQLException e) {
                throw new DALException("erreur au niveau du close " + id, e.getCause());
            }
        }

        return el;
    }

    @Override
    public List<Produit> selectAll() throws DALException {
        // TODO Auto-generated method stub
        Statement stmt = null;
        ResultSet rs = null;
        List<Produit> lesElements = new ArrayList<>();
        Produit el = null;
        //Connection cnx=null;
        Connection cnx = JDBCTools.getConnection();
        try {
            stmt = cnx.createStatement();
            rs = stmt.executeQuery(SQL_SELECT_ALL);
            while (rs.next()) {
                el = new Produit(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5));
                lesElements.add(el);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            throw new DALException("erreur du select all", e.getCause());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                throw new DALException("erreur du select all au niveau du close- ", e.getCause());
            }
        }
        return lesElements;
    }
}
