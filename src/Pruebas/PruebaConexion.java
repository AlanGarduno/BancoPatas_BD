
package Pruebas;
import Controlador.*;
import com.mysql.jdbc.Connection;
import ModelosUsuario.*;
import java.sql.SQLException;


public class PruebaConexion
{

    public static void main(String[] args) throws SQLException
    {
        Conexion conn = new Conexion();
        Connection ref = conn.getConnection();
       // Cuenta c = new Cuenta();
        Tarjeta tar = new Tarjeta(123456789,125,"2018"+"11"+"09",5,2556);
        tar.registrarTarjeta();
    }
}
