package clases;

import java.sql.*;

public class Conexion {

    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/datasystem", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println(" Error en conexion local " + e);
        }
        return (null);
    }

}
