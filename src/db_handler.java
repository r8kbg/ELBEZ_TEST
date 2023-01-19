import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;


public class db_handler extends db_connect_config {
    Connection dbconnection = null;

    public Connection getDbconnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            dbconnection = DriverManager.getConnection("jdbc:sqlite:newDB");
            System.out.println("Connected");
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        /**try {
            System.out.println(1);
            try {
                Class.forName("org.sqlite.JDBC");
                System.out.println(2);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                System.out.println(3);
            }
            System.out.println(4);
            dbconnection = DriverManager.getConnection("jdbc:sqlite:" + dbName);
            System.out.println(5);
            if (dbconnection != null) {
                System.out.println("Connected");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (SQLException e) {
            System.out.println("Erro de conexão ");
            e.printStackTrace();
        }*/
        return dbconnection;
    }
}
