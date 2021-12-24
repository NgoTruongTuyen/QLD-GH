
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phamt
 */
public class DBInfo {
    public static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=QLDH";
    public static String dbUser = "sa";
    public static String dbPass = "sahcmus";
    
    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName(DBInfo.driverName);
            conn = DriverManager.getConnection(DBInfo.dbURL, DBInfo.dbUser, DBInfo.dbPass);
            if (conn != null) {
                System.out.println("Connected");
            }

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        } catch (SQLException throwables) {

            throwables.printStackTrace();
        }
        return conn;
    }
   
    
}
