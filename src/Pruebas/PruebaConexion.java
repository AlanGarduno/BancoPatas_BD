
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
        Cuenta c = new Cuenta();
        Tarjeta tar = new Tarjeta(599,"2017-12-07",c.getID_Cuenta(),6000);
        tar.registrarTarjeta();
    }
}
