package zona_fint.conexion;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConexion(){
        Connection conexion = null;
        var baseDatos = "zona_fit_db";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var user = "root";
        var password = "DanieliniCaporal1012#";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            System.out.println("Error al conectarse a la base de datos " + e.getMessage());
//            throw new RuntimeException(e);
        }
        return conexion;
    }

    public static void main(String[] args) {
        var conection = Conexion.getConexion();
        if(conection != null){
            System.out.println("Conexión exitosa: " + conection);
        }
        else {
            System.out.println("Error al conectarse...");
        }
    }
}
