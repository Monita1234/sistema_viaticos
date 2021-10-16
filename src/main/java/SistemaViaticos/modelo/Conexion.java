/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaViaticos.modelo;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author AUXINVTIC
 */
public class Conexion {

    static final String JDBC_MYSQL_DRIVER = "com.mysql.jdbc.Driver";
    static final String JDBC_MARIADB_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://localhost/viaticos";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "123";

    private Connection conn = null;

    public Connection getConexion() {
        
         System.out.println("0Connecting to a selected database...");

        try {

            //STEP 2: Register JDBC driver
            Class.forName(JDBC_MARIADB_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            System.out.println("Connected database successfully...");

        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e);

            JOptionPane.showMessageDialog(null, "Error en la conexión a la \nbase de datos." + e.toString());
        }
        
        return conn;
    }

    public void desconectar() {
        conn = null;
        System.out.println("Desconexion a base de datos listo...");
    }

}
