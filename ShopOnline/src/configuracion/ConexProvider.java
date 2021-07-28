package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexProvider {

    private final String url = "jdbc:mysql://localhost:3307/veterinaria?useUnicode=true&use"+
            "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String user = "root";
    private String pass = "12345";
    PreparedStatement psPrepararSentencia;
    Connection con = null;

    public ConexProvider() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            if (con != null) {
                System.out.println("Conectado a MySQL correctamente.");
            }
        } catch (SQLException e) {
            System.out.println("Imposible acceder a MySQL. " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Recurso de acceso inválido. " + e.getMessage());
        }
    }

    public Connection conectarDB() {
        return con;
    }

    public void desconectarDB() {
        con = null;
        System.out.println("Conexion a MySQL Terminada.");

    }
    
}
