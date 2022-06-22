package eu.unareil.dal.jdbc;

import eu.unareil.dal.DALException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTools {



    static Connection getConnection() throws DALException {

        StringBuilder sb = new StringBuilder();

        sb.append("jdbc:mysql://");
        sb.append(Settings.getProperty("server"));
        sb.append(":");
        sb.append(Settings.getProperty("port"));
        sb.append("/");
        sb.append(Settings.getProperty("db"));
        sb.append("?");
        sb.append("user=");
        sb.append(Settings.getProperty("user"));
        sb.append("&");
        sb.append("password=");
        sb.append(Settings.getProperty("mdp"));

        System.out.println(sb.toString());

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(sb.toString());

        } catch (SQLException e) {
            throw new DALException("erreur");
        }

        return connection;
    }


}
