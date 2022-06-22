package eu.unareil.dal.jdbc;

import eu.unareil.bo.Auteur;
import eu.unareil.dal.DALException;
import eu.unareil.dal.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AuteurJDBCImpl implements DAO<Auteur>{

    private static final String SQL_INSERT="insert into auteur (nom, prenom) values(?,?)";
    private static final String SQL_UPDATE="update auteur set nom=?, prenom=? where id=?";
    private static final String SQL_DELETE="delete from auteur where id=?";
    private static final String SQL_SELECT_ALL="select * from auteur";
    private static final String SQL_SELECT_BY_ID="select * from auteur where id=?";


    @Override
    public void insert(Auteur data) throws DALException {
        try (Connection connection = JDBCTools.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT)) {
            preparedStatement.setString(1, data.getNom());
            preparedStatement.setString(2, data.getPrenom());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DALException("Erreur lors de l'insertion d'un auteur", e);
        }
    }

    @Override
    public void delete (Auteur data) throws DALException {
        PreparedStatement pstmt = null;
        Connection cnx=null;
        long id=data.getId();
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
                throw new DALException("erreur au niveau du close " + id, e.getCause());
            }
        }
    }

    @Override
    public void update(Auteur data) throws DALException {
        PreparedStatement pstmt = null;
        Connection cnx=null;
        cnx = JDBCTools.getConnection();
        try {
            pstmt = cnx.prepareStatement(SQL_UPDATE);
            pstmt.setString(1, data.getNom());
            pstmt.setString(2, data.getPrenom());
            pstmt.setLong(3, data.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new DALException("erreur du update -id= " , e.getCause());
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
                throw new DALException("erreur au niveau du close ", e.getCause());
            }
        }

    }

    @Override
    public Auteur selectById(long id) throws DALException {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Auteur el = null;
        //Connection cnx=null;
        Connection cnx = JDBCTools.getConnection();
        try {
            pstmt = cnx.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setLong(1, id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                el = new Auteur(rs.getString(2), rs.getString(3));
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
    public List<Auteur> selectAll() throws DALException {
        // TODO Auto-generated method stub
        Statement stmt = null;
        ResultSet rs = null;
        List<Auteur> lesElements = new ArrayList<>();
        Auteur el = null;
        //Connection cnx=null;
        Connection cnx = JDBCTools.getConnection();
        try {
            stmt = cnx.createStatement();
            rs = stmt.executeQuery(SQL_SELECT_ALL);
            while (rs.next()) {
                el = new Auteur(rs.getString(2), rs.getString(3));
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
