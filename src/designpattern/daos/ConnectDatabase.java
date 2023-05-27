/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpattern.daos;

/**
 *
 * @author pnkn0
 */
import java.sql.*;

public class ConnectDatabase {

    private Connection conn = null;

    public Connection getConnection() throws SQLException {

        String serverName = "KHOINGUYEN";
        String dbName = "course_registration_management";
        String user = "sa";
        String pass = "52000695";
        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://" + serverName + ":1433;DatabaseName=" + dbName + ";encrypt=true;trustServerCertificate=true;user=" + user + ";password=" + pass;
        return DriverManager.getConnection(connectionUrl);
    }

    public Statement createStatement() throws SQLException {
        this.conn = getConnection();
        Statement stmt = conn.createStatement();
        return stmt;
    }

    public static void main(String[] args) throws SQLException {
        ConnectDatabase x = new ConnectDatabase();
        if (x.getConnection() != null) {
            System.out.println("succeed");
        } else {
            System.out.println("failed");

        }
    }
}
