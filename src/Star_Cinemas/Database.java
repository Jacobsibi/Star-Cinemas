package Star_Cinemas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jacob.s
 */
public class Database {

    Connection conn = null;
    //Statement statement = null;
    //ResultSet resultSet = null;

    private final String url = "jdbc:derby://localhost:1527/StarCinemasDB";
    private final String usernameDerby = "Jacob";
    private final String passwordDerby = "1234";

    public Connection establishConnection() {
        try
        {
            conn = DriverManager.getConnection(url, usernameDerby, passwordDerby);
            System.out.println("Database connected!");
            return conn;

        } catch (SQLException ex)
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}
